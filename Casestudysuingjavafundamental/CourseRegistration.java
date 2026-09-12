class Student {
    String name;
    String courses[] = new String[5];
    int count = 0;

    Student(String name) {
        this.name = name;
    }

    void registerCourse(String c) {
        if (count >= 5) {
            System.out.println("Cannot register " + c + " max 5 courses allowed");
        } else {
            courses[count] = c;
            count++;
            System.out.println("Registered " + c);
        }
    }

    void displayCourses() {
        System.out.println("Courses of " + name + ":");
        for (int i = 0; i < count; i++) {
            System.out.println(courses[i]);
        }
    }
}

public class CourseRegistration {
    public static void main(String args[]) {
        Student s = new Student("Amit");
        s.registerCourse("Java");
        s.registerCourse("Python");
        s.registerCourse("Maths");
        s.registerCourse("English");
        s.registerCourse("Science");
        s.registerCourse("History");
        s.displayCourses();
    }
}
