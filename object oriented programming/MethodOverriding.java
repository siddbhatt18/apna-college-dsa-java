public class MethodOverriding {
    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.eat();
        Cat beluga = new Cat();
        beluga.eat();
        Animal mammal = new Animal();
        mammal.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("animal eats");
    }
}
class Cat extends Animal {
    void eat() {
        System.out.println("cat eats");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("dog eats");
    }
}