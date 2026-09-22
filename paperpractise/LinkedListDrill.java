import java.util.*;

public class LinkedListDrill {

    public static void visitPage(LinkedList<String> history, String url) {
        // TODO: Add the url to the end of the linked list
        history.add(url);
    }

    public static String getLastPage(LinkedList<String> history) {
        // TODO: Return the last page in the history without removing it. 
        // Do NOT use .get() with an index. Use the built-in LinkedList method for ends.

        return history.peekLast();
    }

    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<>();

        visitPage(history, "google.com");
        visitPage(history, "github.com");
        visitPage(history, "stackoverflow.com");

        System.out.println("Current History: " + history);
        System.out.println("Last Visited: " + getLastPage(history));
    }
}
