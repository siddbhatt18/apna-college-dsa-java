public class PrintInAscending {
    public static void printAscending(int num) {
        if(num == 1) {
            System.out.println(num);
            return;
        }
        printAscending(num - 1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 10;
        printAscending(num);
    }
}