public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.sum(10, 15));
        System.out.println(obj.sum(12.5f, 17.5f));
        System.out.println(obj.sum(10, 25, 45));
        System.out.println(obj.sum(10.25f, 15.75f, 20.00f));
    }
}
class Calculator {
    int sum(int a, int b) {
        return (a + b);
    }
    float sum(float a, float b) {
        return (a + b);
    }
    int sum(int a, int b, int c) {
        return (a + b + c);
    }
    float sum(float a, float b, float c) {
        return (a + b + c);
    }
}