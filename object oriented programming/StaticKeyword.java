public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "tony";
        s1.roll = 10;
        s1.school = "xaviers";
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.school);
        Student s2 = new Student();
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.school);
    }
}
class Student {
    String name;
    int roll;
    static String school;
}