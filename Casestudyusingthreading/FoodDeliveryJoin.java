public class FoodDeliveryJoin {

    static class PrepareFood extends Thread {
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Preparing step " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Preparation interrupted");
                }
            }
            System.out.println("Food ready");
        }
    }

    static class DeliverFood extends Thread {
        public void run() {
            System.out.println("Delivering food");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Delivery interrupted");
            }
            System.out.println("Food delivered");
        }
    }

    public static void main(String[] args) {
        PrepareFood prepare = new PrepareFood();
        DeliverFood deliver = new DeliverFood();

        prepare.start();
        try {
            prepare.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        deliver.start();
        try {
            deliver.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Order completed");
    }
}
