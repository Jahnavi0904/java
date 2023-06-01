public class Student {
    String Name;

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public static void main(String[] args) {
        Student J = new Student();
        J.setName("jahnavi");
        System.out.println(J.getName());
    }
}