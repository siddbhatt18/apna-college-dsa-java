public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        Student s2 = new Student("tony");
        System.out.println(s2.name);
        System.out.println(s2.roll);
        Student s3 = new Student("george", 45);
        System.out.println(s3.name);
        System.out.println(s3.roll);
    }
}
class Student {
    String name;
    int roll;
    Student() {
        name = "null";
        roll = 0;
    }
    Student(String name) {
        this.name = name;
        roll = 0;
    }
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}