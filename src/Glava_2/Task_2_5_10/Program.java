package Glava_2.Task_2_5_10;

public class Program {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", "Leman Brothers");
        sam.display();
        Client bob = new Client("Bob", "Leman Brothers");
        bob.display();
    }
}
abstract class Person {

    private final String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void display();
}

class Employee extends Person {

    private final String bank;

    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display() {
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
class Client extends Person {
    private final String bank;

    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display() {
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
