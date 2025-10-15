public class ClearBitsRange {
    public static int clearRange(int num, int start, int end) {
        int a = -1 << (end + 1);
        int b = (1 << start) - 1;
        int bitMask = a | b;
        return (num & bitMask);
    }
    public static void main(String[] args) {
        int num = 2515;
        int start = 2;
        int end = 7;
        System.out.println(clearRange(num, start, end));
    }
}