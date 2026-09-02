
class excep {

    int a, b, c;

    void add() {
        try {
            a = 10;
            b = 0;
            c = a / b;
            System.out.println("Result=" + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String args[]) {
        excep obj = new excep();
        obj.add();
    }
}
