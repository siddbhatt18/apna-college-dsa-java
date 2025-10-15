public class PrintNthFibonacci {
    public static int findFibonacci(int num) {
        if(num == 0) {
            return 0;
        }
        if(num == 1) {
            return 1;
        }
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }
    public static void main(String[] args) {
        int num = 8;
        System.out.println(findFibonacci(num));
    }
}