import java.util.*;

public class PriorityQueueDrill {

    public static void addPatient(PriorityQueue<Integer> pq, int severityCode) {
        // TODO: Add the severity code to the priority queue
        pq.add(severityCode);
    }

    public static int getNextPatient(PriorityQueue<Integer> pq) {
        // TODO: Remove and return the next highest priority (lowest number severity) patient

        return pq.poll();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> erQueue = new PriorityQueue<>();

        addPatient(erQueue, 3); // Priority 3
        addPatient(erQueue, 1); // Priority 1 (highest priority)
        addPatient(erQueue, 5); // Priority 5

        System.out.println("Next patient to treat: " + getNextPatient(erQueue)); // Should be 1
        System.out.println("Following patient to treat: " + getNextPatient(erQueue)); // Should be 3
    }
}