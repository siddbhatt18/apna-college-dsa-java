public class DeepCopyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "tony";
        s1.roll = 20;
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.marks[0]);
        System.out.println(s1.marks[1]);
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        s1.marks[0] = 100;
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
    }
}
class Student {
    String name;
    int roll;
    int marks[];
    Student() {
        marks = new int[2];
        name = "";
        roll = 0;
    }
    Student(Student std) {
        marks = new int[2];
        this.name = std.name;
        this.roll = std.roll;
        for(int i = 0; i < std.marks.length; i++) {
            this.marks[i] = std.marks[i];
        }
    }
}