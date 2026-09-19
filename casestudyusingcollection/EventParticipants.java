import java.util.*;

public class EventParticipants {

    public static Set<Integer> findAllParticipants(
            Set<Integer> event1,
            Set<Integer> event2) {
                Set<Integer> find=new LinkedHashSet<>(event1);
                find.addAll(event2);

        // Write your code
        return find;
    }

    public static void main(String[] args) {

        Set<Integer> event1 =
                new HashSet<>(Arrays.asList(101, 102, 103));

        Set<Integer> event2 =
                new HashSet<>(Arrays.asList(103, 104, 105));

        Set<Integer> result =
                findAllParticipants(event1, event2);

        System.out.println(result);
    }
}

