import java.util.*;
public class ParkingSystem {
    public static void main(String[] args) {
        Stack<String> p = new Stack<>();
        p.push("KA01");
        p.push("KA02");
        p.push("KA03");
        System.out.println("Parking Stack Size: " + p.size());
        if (p.size() < 5) {
            p.push("KA04");
            System.out.println("Vehicle KA04 parked");
        } else {
            System.out.println("Parking Full");
        }
        String leaving = p.pop();
        System.out.println("Vehicle leaving: " + leaving);
        System.out.println("Remaining vehicles:");
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i));
        }
        int hours = 4;
        int charge = 50 + (hours > 2 ? (hours - 2) * 20 : 0);
        System.out.println("Parking charge for " + hours + " hours: " + charge);
    }
}
