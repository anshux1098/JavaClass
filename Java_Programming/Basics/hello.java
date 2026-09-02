
class hello {

    int a, b, res;

    void sum() {
        a = 5;
        b = 6;
        res = a + b;
        System.out.println("Sum = " + res);

    }

    public static void main(String args[]) {
        hello obj = new hello();
        hello obj2 = new hello();
        obj.sum();
        obj2.sum();
    }

}
