public class SumOfNumbers {
    public static int sumOfNumbers(int num) {
        if(num == 1) {
            return 1;
        }
        return num + sumOfNumbers(num - 1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sumOfNumbers(num));
    }
}