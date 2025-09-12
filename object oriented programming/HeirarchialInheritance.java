public class HeirarchialInheritance {
    public static void main(String[] args) {
        Mammals human = new Mammals();
        human.walk();
        human.eat();
        Bird sparrow = new Bird();
        sparrow.fly();
        sparrow.eat();
        Fish shark = new Fish();
        shark.swim();
        shark.eat();
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
class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}