import java.util.InputMismatchException;
import java.util.Scanner;

public class BusTicketBookingSystem {
    public static void main(String[] args) {
        int availableSeats = 40;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter passenger age: ");
            int age = scanner.nextInt();
            if (age <= 0) {
                throw new IllegalArgumentException("Invalid age! Age must be greater than 0.");
            }
            System.out.print("Enter number of seats to book: ");
            int requestedSeats = scanner.nextInt();
            if (requestedSeats <= 0) {
                throw new IllegalArgumentException("Invalid number of seats! Seats must be greater than 0.");
            }
            if (requestedSeats > availableSeats) {
                throw new IllegalArgumentException("Insufficient seats! Only " + availableSeats
                        + " seats available, but you requested " + requestedSeats + ".");
            }
            availableSeats -= requestedSeats;
            System.out.println("\nBooking Confirmed!");
            System.out.println("Passenger Age: " + age);
            System.out.println("Seats Booked: " + requestedSeats);
            System.out.println("Remaining Seats: " + availableSeats);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
