public class SingleLevelInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
        shark.eat();
        shark.sleep();
    }
}
class Animal {
    String colour;
    void eat() {
        System.out.println("eats");
    }
    void sleep() {
        System.out.println("sleeps");
    }
}
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims");
    }
}