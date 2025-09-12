public class HybridInheritance {
    public static void main(String[] args) {
        Dog beagle = new Dog();
        beagle.bark();
        beagle.walk();
        beagle.eat();
        Peacock opal = new Peacock();
        opal.dance();
        opal.fly();
        opal.eat();
        Shark blacktip = new Shark();
        blacktip.hunt();
        blacktip.swim();
        blacktip.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("eats");
    }
}
class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
class Dog extends Mammals {
    void bark() {
        System.out.println("barks");
    }
}
class Cat extends Mammals { 
    void meow() {
        System.out.println("meows");
    }
}
class Human extends Mammals {
    void speak() {
        System.out.println("speaks");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}
class Peacock extends Bird {
    void dance() {
        System.out.println("dances");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}
class Shark extends Fish {
    void hunt() {
        System.out.println("hunts");
    }
}
class Tuna extends Fish {
    void hook() {
        System.out.println("hooks");
    }
}