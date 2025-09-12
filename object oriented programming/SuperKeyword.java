public class SuperKeyword {
    public static void main(String[] args) {
        Mammals m1 = new Mammals();
        Human h1 = new Human();
    }
}
class Animal {
    Animal() {
        System.out.println("animal constructor");
    }
}
class Mammals extends Animal {
    Mammals() {
        super();
        System.out.println("mammal constructor");
    }
}
class Human extends Mammals {
    Human() {
        super();
        System.out.println("human constructor");
    }
}