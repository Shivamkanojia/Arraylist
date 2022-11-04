public class Employee extends Person {
    private int empid;
    private int salary;

    public Employee(java.lang.String string, int age, int empid, int salary) {
        super(string, age);
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", salary=" + salary + "]";
    }


    

}
