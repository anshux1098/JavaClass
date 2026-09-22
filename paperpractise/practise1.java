import java.util.*;

public class practise1 {

    public static void updateScore(List<Integer> scores, int index, int newScore) {
        // TODO: Write code to update the element at the given index with newScore
        scores.set(index, newScore);
    }

    public static int findFirstFail(List<Integer> scores) {
        // TODO: Return the index of the first score that is less than 40. 
        // If no score is below 40, return -1. (Hint: use a loop and .get())
        for(int i=0;i<scores.size();i++)
        {
            if(scores.get(i)<40)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(35);
        scores.add(90);
        scores.add(28);

        updateScore(scores, 1, 45); // Should change 35 to 45
        System.out.println("Updated Scores: " + scores);

        int failIndex = findFirstFail(scores);
        System.out.println("First Fail Index: " + failIndex);
    }
}
