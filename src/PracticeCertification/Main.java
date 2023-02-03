package PracticeCertification;

public class Main {

    public static void main(String[] args) {

        Employee anam = new Employee("Anam", 25, 8000);

        anam.raiseSalary();

        System.out.println("Anam's location = " + Employee.location);

        Employee baz = new Employee("Baz", 22, 10000);

        System.out.println("baz = " + baz);
        baz.raiseSalary();
    }
}
