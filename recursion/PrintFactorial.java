public class PrintFactorial {
    public static int printFactorial(int num) {
        if(num == 0) {
            return 1;
        }
        return num * printFactorial(num - 1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(printFactorial(num));
    }
}