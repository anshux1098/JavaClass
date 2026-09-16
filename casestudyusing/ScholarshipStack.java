import java.util.*;
public class ScholarshipStack {
    public static void main(String[] args) {
        Stack<Double> st = new Stack<>();
        st.push(92.0);
        st.push(85.0);
        st.push(75.0);
        st.push(65.0);
        st.push(50.0);
        while (!st.isEmpty()) {
            double per = st.pop();
            int scholarship;
            if (per >= 90) {
                scholarship = 20000;
            } else if (per >= 80) {
                scholarship = 15000;
            } else if (per >= 70) {
                scholarship = 10000;
            } else if (per >= 60) {
                scholarship = 5000;
            } else {
                scholarship = 0;
            }
            System.out.println("Percentage: " + per + " Scholarship: " + scholarship);
        }
    }
}
