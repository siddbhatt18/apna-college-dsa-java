public class BinaryCombinations {
    public static void printBinaryString(int size, int lastPlace, String str) {
        if(size == 0) {
            System.out.println(str);
            return;
        }
        printBinaryString(size - 1, 0, str + "0");
        if(lastPlace == 0) {
            printBinaryString(size - 1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        int size = 3;
        printBinaryString(size, 0, "");
    }
}