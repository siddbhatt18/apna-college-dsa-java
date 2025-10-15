public class UpdateIthBit {
    public static int updateBit(int num, int pos, int newBit) {
        if(newBit == 0) {
            int bitMask = ~(1 << pos);
            return (num & bitMask);
        } 
        else {
            int bitMask = 1 << pos;
            return (num | bitMask);
        }
    }
    public static void main(String[] args) {
        int num = 10;
        int pos = 2;
        int newBit = 1;
        System.out.println(updateBit(num, pos, newBit));
    }
}