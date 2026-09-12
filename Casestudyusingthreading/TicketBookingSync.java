class Theatre {
    int seats = 5;

    synchronized void book(String customer, int wanted) {
        if (wanted <= seats) {
            System.out.println(customer + " booked " + wanted + " seats.");
            seats = seats - wanted;
            System.out.println("Seats left: " + seats);
        } else {
            System.out.println(customer + " could not book. Not enough seats. Seats left: " + seats);
        }
    }
}

class TicketCustomer extends Thread {
    Theatre theatre;
    String customer;
    int wanted;

    TicketCustomer(Theatre theatre, String customer, int wanted) {
        this.theatre = theatre;
        this.customer = customer;
        this.wanted = wanted;
    }

    public void run() {
        theatre.book(customer, wanted);
    }
}

public class TicketBookingSync {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();

        TicketCustomer t1 = new TicketCustomer(theatre, "Amit", 2);
        TicketCustomer t2 = new TicketCustomer(theatre, "Priya", 2);
        TicketCustomer t3 = new TicketCustomer(theatre, "Rahul", 2);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Remaining seats: " + theatre.seats);
    }
}
