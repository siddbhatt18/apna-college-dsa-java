public class DecimalToBinary {
    public static int decToBin(int decNum) {
        int binNum = 0;
        int pow = 0;
        while(decNum != 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            decNum = decNum / 2;
            pow++;
        }
        return binNum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(decToBin(n));
    }
}