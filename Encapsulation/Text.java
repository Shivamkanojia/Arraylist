class Student {
    private String name;
    public int id = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // jo variable public hai uska get ,set banaey ka jarurat nhi hai

}

public class Text {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Shivam");
        System.out.println(s.getName());
        System.out.println(s.id);
    }
}