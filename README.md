# JavaClass — OOP Practice Repository

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Subject](https://img.shields.io/badge/Subject-OOP-blue?style=flat-square)
![College](https://img.shields.io/badge/College-KIET-green?style=flat-square)
![Status](https://img.shields.io/badge/Status-Regularly%20Updated-success?style=flat-square)

This repository contains my Java class work and self-practice programs for **Object-Oriented Programming (OOP)**. It's used to track coursework, practice exercises, and small demo programs written during and after class, so that my teacher can review my progress.

## 👤 Student Details

- **Name:** Anshuman
- **College:** KIET
- **Roll No.:** 202501100600030
- **Subject:** Object-Oriented Programming (Java)
- **GitHub:** [@anshux1098](https://github.com/anshux1098/JavaClass)

## 📁 Repository Structure

Organized into 2 main categories — **Java Programming** (basics) and **OOPs** (core OOP concepts). Just drop new `.java` files into the relevant subfolder:

```
JavaClass/
├── Java_Programming/
│   ├── Basics/                      → hello.java
│   ├── Control_Flow/                → if-else, loops, switch
│   ├── Arrays_and_Strings/          → arrays, String handling
│   ├── Methods_and_Functions/       → methods, recursion
│   ├── Input_Output/                → Scanner, BufferedReader
│   └── Patterns/                    → star / number patterns
├── OOPs/
│   ├── Classes_and_Objects/         → employee.java
│   ├── Constructors/                → constructors demo
│   ├── Inheritance_and_Polymorphism/→ pdemo.java + cdemo.java
│   ├── Abstraction/                 → abstract class, interfaces
│   ├── Encapsulation/               → getters/setters
│   ├── Exception_Handling/          → excep.java
│   ├── Multithreading/              → mythread2.java (WIP)
│   ├── File_Handling/               → FileReader/Writer
│   └── Collections_and_Packages/    → ArrayList, packages
├── README.md
└── .gitignore
```

> Each subfolder has its own `README.md` — open any folder to see what belongs there.

## 📚 Programs Overview

> Auto-updated by `scripts/update_readme.py` — do not edit rows manually. Just add `.java` files and push.

<!-- PROGRAMS:START -->
| File | Location | Topic | Concepts | Status |
|---|---|---|---|---|
| `cdemo.java` | `OOPs/Inheritance_and_Polymorphism/` | Inheritance & Polymorphism — Child class | extends, overriding | ✅ Done |
| `employee.java` | `OOPs/Classes_and_Objects/` | Class & object modeling | class, this keyword | ✅ Done |
| `excep.java` | `OOPs/Exception_Handling/` | Exception handling | try-catch, ArithmeticException | ✅ Done |
| `hello.java` | `Java_Programming/Basics/` | Basic Java syntax / first program | class, object, method | ✅ Done |
| `mythread2.java` | `OOPs/Multithreading/` | Multithreading | Thread, Runnable | 🚧 WIP |
| `pdemo.java` | `OOPs/Inheritance_and_Polymorphism/` | Inheritance — Parent class | inheritance, constructor | ✅ Done |
<!-- PROGRAMS:END -->

## ▶️ How to Run

Each `.java` file can be compiled and run independently:

```bash
javac <filename>.java
java <ClassName>
```

Examples:

```bash
# Basics
javac Java_Programming/Basics/hello.java
java -cp Java_Programming/Basics hello

# Classes & Objects
javac OOPs/Classes_and_Objects/employee.java
java -cp OOPs/Classes_and_Objects employee

# Inheritance & Polymorphism (compile both together)
javac OOPs/Inheritance_and_Polymorphism/pdemo.java OOPs/Inheritance_and_Polymorphism/cdemo.java
java -cp OOPs/Inheritance_and_Polymorphism cdemo

# Exception Handling
javac OOPs/Exception_Handling/excep.java
java -cp OOPs/Exception_Handling excep
```

> Tip: Run from the folder containing the file, or use `-cp` as shown above.

<details>
<summary>📤 Sample Outputs (click to expand)</summary>

```
hello → Sum = 11 (twice, for obj + obj2)
employee → Name:ansh Age:25 / Name:Abhay Age:30
excep → Error: Division by zero is not allowed.
cdemo → (currently throws ClassCastException — see note in code)
```

</details>

## ➕ How to Add a New Program

1. Pick the right subfolder (see tree above)
2. Add your file: e.g., `OOPs/Encapsulation/EncapDemo.java`
3. Compile & test locally
4. Commit & push — the table above updates automatically via GitHub Action:
   ```bash
   git add <path/to/file>
   git commit -m "add: <topic> — <filename>"
   git push
   ```
   > Local preview (optional): `python scripts/update_readme.py`

## 📌 Purpose

This repo is maintained as part of my OOP coursework to:
- Practice core Java/OOP concepts (classes, objects, constructors, inheritance, polymorphism, exceptions, threads, etc.)
- Keep a versioned record of class work and self-practice
- Allow my teacher to review submitted programs

## 🛠️ Tools Used

- Java (JDK 17)
- Visual Studio Code

---

*This repository is updated regularly as new topics are covered in class.*
