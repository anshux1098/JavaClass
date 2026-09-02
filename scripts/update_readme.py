#!/usr/bin/env python3
"""
Auto-generates the Programs Overview table in README.md
from Java_Programming/**/*.java and OOPs/**/*.java

- Folder name = Topic/Concepts (lookup table)
- Empty file (<10 bytes) = WIP, else Done
- Only rewrites content between <!-- PROGRAMS:START --> and <!-- PROGRAMS:END -->
"""
from pathlib import Path
import re
import sys
# fix Windows cp1252 emoji crash
if hasattr(sys.stdout, "reconfigure"):
    try:
        sys.stdout.reconfigure(encoding="utf-8", errors="replace")
    except Exception:
        pass
if hasattr(sys.stderr, "reconfigure"):
    try:
        sys.stderr.reconfigure(encoding="utf-8", errors="replace")
    except Exception:
        pass

ROOT = Path(__file__).resolve().parent.parent
README = ROOT / "README.md"

# Folder -> (Topic, Concepts)
FOLDER_META = {
    "Basics": ("Basic Java syntax / first program", "class, object, method"),
    "Control_Flow": ("Control Flow", "if-else, loops, switch"),
    "Arrays_and_Strings": ("Arrays and Strings", "arrays, String, StringBuilder"),
    "Methods_and_Functions": ("Methods and Functions", "methods, recursion, overloading"),
    "Input_Output": ("Input / Output", "Scanner, BufferedReader, I/O"),
    "Patterns": ("Patterns", "star, number patterns"),
    "Classes_and_Objects": ("Class & object modeling", "class, object, this"),
    "Constructors": ("Constructors", "default, parameterized, copy constructor"),
    "Inheritance_and_Polymorphism": ("Inheritance & Polymorphism", "extends, overriding, polymorphism"),
    "Abstraction": ("Abstraction", "abstract class, interface"),
    "Encapsulation": ("Encapsulation", "private fields, getters/setters"),
    "Exception_Handling": ("Exception handling", "try-catch, ArithmeticException"),
    "Multithreading": ("Multithreading", "Thread, Runnable"),
    "File_Handling": ("File Handling", "FileReader, FileWriter"),
    "Collections_and_Packages": ("Collections and Packages", "ArrayList, HashMap, packages"),
}

# Special overrides for specific files where topic is more precise
FILE_OVERRIDES = {
    "pdemo.java": ("Inheritance — Parent class", "inheritance, constructor"),
    "cdemo.java": ("Inheritance & Polymorphism — Child class", "extends, overriding"),
    "hello.java": ("Basic Java syntax / first program", "class, object, method"),
    "employee.java": ("Class & object modeling", "class, this keyword"),
    "excep.java": ("Exception handling", "try-catch, ArithmeticException"),
}

SCAN_ROOTS = [ROOT / "Java_Programming", ROOT / "OOPs"]

def get_meta(java_file: Path):
    folder = java_file.parent.name
    topic, concepts = FOLDER_META.get(folder, (folder.replace("_", " "), "—"))
    # apply file-specific override if exists
    if java_file.name in FILE_OVERRIDES:
        topic, concepts = FILE_OVERRIDES[java_file.name]
    return topic, concepts

def get_status(java_file: Path):
    try:
        size = java_file.stat().st_size
        # treat empty or whitespace-only as WIP
        if size < 10:
            return "🚧 WIP"
        text = java_file.read_text(encoding="utf-8", errors="ignore").strip()
        if not text:
            return "🚧 WIP"
        return "✅ Done"
    except Exception:
        return "✅ Done"

def collect_rows():
    rows = []
    for scan_root in SCAN_ROOTS:
        if not scan_root.exists():
            continue
        for java_file in scan_root.rglob("*.java"):
            rel_dir = java_file.parent.relative_to(ROOT).as_posix() + "/"
            topic, concepts = get_meta(java_file)
            status = get_status(java_file)
            rows.append((java_file.name.lower(), java_file.name, rel_dir, topic, concepts, status))
    # sort by filename for deterministic order
    rows.sort(key=lambda x: x[0])
    return rows

def build_table(rows):
    header = "| File | Location | Topic | Concepts | Status |\n|---|---|---|---|---|"
    lines = [header]
    for _, name, rel_dir, topic, concepts, status in rows:
        lines.append(f"| `{name}` | `{rel_dir}` | {topic} | {concepts} | {status} |")
    # if no rows, keep a placeholder comment
    if len(rows) == 0:
        lines.append("| *no programs yet* | — | — | — | — |")
    return "\n".join(lines)

def update_readme():
    if not README.exists():
        print(f"README not found at {README}")
        return 1
    content = README.read_text(encoding="utf-8")
    rows = collect_rows()
    table = build_table(rows)

    pattern = re.compile(r"<!-- PROGRAMS:START -->.*?<!-- PROGRAMS:END -->", re.DOTALL)
    replacement = f"<!-- PROGRAMS:START -->\n{table}\n<!-- PROGRAMS:END -->"

    if not pattern.search(content):
        print("Markers <!-- PROGRAMS:START --> / <!-- PROGRAMS:END --> not found in README.md")
        return 1

    new_content = pattern.sub(replacement, content)

    if new_content == content:
        print("README already up to date — no changes.")
        return 0

    README.write_text(new_content, encoding="utf-8")
    print(f"Updated README with {len(rows)} program(s):")
    for _, name, rel_dir, topic, concepts, status in rows:
        print(f"  - {name} @ {rel_dir} -> {status}")
    return 0

if __name__ == "__main__":
    raise SystemExit(update_readme())
