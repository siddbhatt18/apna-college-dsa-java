public class ClassesAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("rahul");
        System.out.println(s1.name);
        s1.setAge(21);
        System.out.println(s1.age);
        s1.calculatePercentage(60, 70, 80);
        System.out.println(s1.percentage);
    }
}
class Student {
    String name;
    int age;
    float percentage;
    void setName(String newName) {
        name = newName;
    }
    void setAge(int newAge) {
        age = newAge;
    }
    void calculatePercentage(int physics, int chemistry, int maths) {
        percentage = (physics + chemistry + maths) / 3;
    }
}