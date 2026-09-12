class Patient {
    int patientId;
    String name;
    int age;
    double temperature;

    Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    void checkFever() {
        if (temperature > 100.4) {
            System.out.println("Status: Fever");
        } else {
            System.out.println("Status: Normal");
        }
    }

    void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        checkFever();
    }
}

public class PatientManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Rahul", 25, 101.2);
        Patient p2 = new Patient(2, "Priya", 30, 98.6);
        p1.display();
        System.out.println("");
        p2.display();
    }
}
