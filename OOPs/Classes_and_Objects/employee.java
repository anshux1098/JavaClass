
class employee {

    int age;
    String name;

    void data1() {
        age = 25;
        name = "ansh";
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    void data2(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.data1();

        employee e2 = new employee();
        e2.data2(30, "Abhay");
    }
}
