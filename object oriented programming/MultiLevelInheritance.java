public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog beagle = new Dog();
        beagle.bark();
        beagle.walk();
        beagle.eat();
        beagle.sleep();
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
class Mammals extends Animal {
    int legs;
    void walk() {
        System.out.println("walks");
    }
}
class Dog extends Mammals {
    String breed;
    void bark() {
        System.out.println("barks");
    }
}