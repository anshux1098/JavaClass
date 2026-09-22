import java.util.*;

public class HashSetDrill {

    public static Set<Integer> getUniqueVisitors(List<Integer> visitorLogs) {
        // TODO: Create a HashSet, add all elements from visitorLogs to it, and return the set
        Set <Integer> n=new HashSet<>(visitorLogs);
        return n;
    }

    public static boolean hasVisited(Set<Integer> uniqueVisitors, int id) {
        // TODO: Check if the set contains the given id using the correct set method
        if(uniqueVisitors.contains(id))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        List<Integer> logsList = Arrays.asList(101, 102, 101, 103, 102, 104);

        Set<Integer> unique = getUniqueVisitors(logsList);
        System.out.println("Unique Visitors: " + unique);

        System.out.println("Did 103 visit? " + hasVisited(unique, 103));
        System.out.println("Did 999 visit? " + hasVisited(unique, 999));
    }
}
