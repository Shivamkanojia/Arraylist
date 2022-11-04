class Person {
    String name;
    int age;

    public Person() {
        super();
    }

    public void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Employee  extends Person{
    int empid;
    double salary;

    public Employee() {
        super();
    }

    public Employee(String name, int age, int empid, double salary) {
        super();
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return 
    };

}

public class Pract {
    public static void main(String[] args) {

    }
}
