public class SetIthBit {
    public static int setBit(int num, int pos) {
        int bitMask = 1 << pos;
        return (num | bitMask);
    }
    public static void main(String[] args) {
        int num = 10;
        int pos = 2;
        System.out.println(setBit(num, pos)); 
    }
}