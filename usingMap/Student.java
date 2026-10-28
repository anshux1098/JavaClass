import java.util.*;

class Student implements Comparable<Student> {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int compareTo(Student s) {
        return s.rollno - this.rollno;
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "Ansh"));
        students.add(new Student(5, "Rahul"));
        students.add(new Student(41, "Priya"));
        students.add(new Student(12, "Dev"));

        Collections.sort(students);
        System.out.println(students);
    }
}