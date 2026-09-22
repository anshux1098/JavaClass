import java.util.*;

public class ArrayDequeDrill {

    public static void addHighPriorityTask(ArrayDeque<String> tasks, String task) {
        // TODO: Add the task to the FRONT of the deque using the correct Deque method
        tasks.addHighPriorityTask(task);
    }

    public static void addStandardTask(ArrayDeque<String> tasks, String task) {
        // TODO: Add the task to the BACK of the deque using the correct Deque method
        task.addStandardTask(task);
    }

    public static void main(String[] args) {
        ArrayDeque<String> taskDeque = new ArrayDeque<>();

        addStandardTask(taskDeque, "Task B (Normal)");
        addHighPriorityTask(taskDeque, "Task A (Urgent!)");
        addStandardTask(taskDeque, "Task C (Normal)");

        System.out.println("Task order (Front to Back): " + taskDeque);
        System.out.println("First task to execute: " + taskDeque.peekFirst());
        System.out.println("Last task to execute: " + taskDeque.peekLast());
    }
}