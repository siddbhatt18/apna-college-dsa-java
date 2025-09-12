public class GetIthBit {
    public static int getBit(int num, int pos) {
        int bitMask = 1 << pos;
        if((num & bitMask) == 0) {
            return 0;
        } 
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int num = 5;
        int pos = 2;
        System.out.println(getBit(num, pos));
    }
}