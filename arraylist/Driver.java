import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Person p1=new Person("Shivam",18);
        // Person p2 =new Person("Shahid",22);
        // Person p3 =new Person("Aman", 18);

        ArrayList<Person> ll =new ArrayList<Person>();
        ll.add(new Person("Shivam",18));
        ll.add(new Person("shahid", 22));
        ll.add(new Person("aman",18));

        System.out.println(ll);
        Person p4=new Person("Abdul",40);


        ll.remove(0);
        ll.add(p4);
        System.out.println(ll);

        ll.clear();

        System.out.println(ll);
        System.out.println(p4.toString());

        Employee e1=new Employee("Shivam", 18, 100, 15000);
        System.out.println(e1.toString());

        Person p6 = new Employee("shaktiman", 150, 180, 200000);
        System.out.println(p6.toString());



    }
}
