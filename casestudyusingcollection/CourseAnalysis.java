import java.util.*;

public class CourseAnalysis {

    public static Set<Integer> commonStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {
        
        Set<Integer> common = new HashSet<>(javaStudents);
        common.retainAll(pythonStudents); // Keeps only elements present in both
        return common;
    }

    public static Set<Integer> allStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        Set<Integer> all = new LinkedHashSet<>(javaStudents);
        all.addAll(pythonStudents); // Merges both sets
        return all;
    }

    public static Set<Integer> onlyJava(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        Set<Integer> onlyJavaSet = new HashSet<>(javaStudents);
        onlyJavaSet.removeAll(pythonStudents); // Removes Python students, leaving only Java
        return onlyJavaSet;
    }

    public static void main(String[] args) {

        Set<Integer> javaStudents =
                new HashSet<>(
                    Arrays.asList(101, 102, 103, 104));

        Set<Integer> pythonStudents =
                new HashSet<>(
                    Arrays.asList(103, 104, 105, 106));

        System.out.println("Both: "
                + commonStudents(javaStudents, pythonStudents));

        System.out.println("Either: "
                + allStudents(javaStudents, pythonStudents));

        System.out.println("Only Java: "
                + onlyJava(javaStudents, pythonStudents));
    }
}