public class EvenOdd {
    public static void checkEvenOdd(int num) {
        if((num & 1) == 0) {
            System.out.println("even");
        }
        if((num & 1) == 1) {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int num = 14;
        checkEvenOdd(num);
    }
}