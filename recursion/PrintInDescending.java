public class PrintInDescending {
    public static void printDescending(int num) {
        if(num == 1) {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printDescending(num - 1);
    }
    public static void main(String[] args) {
        int num = 10;
        printDescending(num);
    }
}