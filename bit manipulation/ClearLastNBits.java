public class ClearLastNBits {
    public static int clearLastBits(int num, int n) {
        int bitMask = -1 << n;
        return (num & bitMask);
    }
    public static void main(String[] args) {
        int num = 15;
        int n = 2;
        System.out.println(clearLastBits(num, n));
    }
}