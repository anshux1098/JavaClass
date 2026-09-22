import java.util.*;

public class TreeSetDrill {

    public static int getLowestScore(TreeSet<Integer> scores) {
        // TODO: Return the minimum/first score in the tree set without removing it

        return scores.first();
    }

    public static int getNextScoreAbove(TreeSet<Integer> scores, int target) {
        // TODO: Find and return the smallest score strictly greater than the target value
        return scores.higher(target);
    }

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(45);
        scores.add(90);
        scores.add(12);
        scores.add(65);
        scores.add(80);

        System.out.println("Sorted Scores: " + scores);
        System.out.println("Lowest Score: " + getLowestScore(scores));
        System.out.println("Score higher than 65: " + getNextScoreAbove(scores, 65));
    }
}
