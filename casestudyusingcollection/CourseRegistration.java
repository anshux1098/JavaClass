import java.util.*;

public class CourseRegistration {

    public static void registerCourse(Set<String> courses, String course) {
        courses.add(course);
        // Write your code
    }

    public static boolean isRegistered(Set<String> courses, String course) {
        // Write your code
        for(String cours : courses)
        {
            if(cours==course)
            {
                return true;
            }
        }
        return false;
    }

    public static void dropCourse(Set<String> courses, String course) {
        // Write your code
        courses.remove(course);
    }

    public static void displayCourses(Set<String> courses) {
        if(courses.isEmpty())
        {
            return;
        }
        for(String course : courses)
        {
            System.out.println(course);
        }

        // Write your code
    }

    public static void main(String[] args) {

        Set<String> courses = new HashSet<>();

        registerCourse(courses, "Java");
        registerCourse(courses, "Python");
        registerCourse(courses, "DBMS");
        registerCourse(courses, "Java");

        System.out.println("Courses:");
        displayCourses(courses);

        System.out.println("Python registered: "
                + isRegistered(courses, "Python"));

        dropCourse(courses, "DBMS");

        System.out.println("After dropping DBMS:");
        displayCourses(courses);
    }
}

