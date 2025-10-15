public class ClearIthBit {
    public static int clearBit(int num, int pos) {
        int bitMask = ~(1 << pos);
        return (num & bitMask);
    }
    public static void main(String[] args) {
        int num = 10; 
        int pos = 1;
        System.out.println(clearBit(num, pos));
    }
}