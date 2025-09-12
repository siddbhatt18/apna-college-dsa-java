public class AbstractClasses {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        System.out.println(h1.colour);
        h1.changeColour();
        System.out.println(h1.colour);
        Bird b1 = new Bird();
        b1.walk();
        b1.eat();
        System.out.println(b1.colour);
        b1.changeColour();
        System.out.println(b1.colour);
    }
}
abstract class Animal {
    String colour;
    Animal() {
        System.out.println("animal constructor");
        colour = "brown";
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor");
    }
    void changeColour() {
        colour = "black";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Bird extends Animal {
    Bird() {
        System.out.println("bird constrcutor");
    }
    void changeColour() {
        colour = "white";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}