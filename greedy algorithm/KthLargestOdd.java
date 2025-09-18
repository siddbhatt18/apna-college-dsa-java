public class KthLargestOdd {
    public static int kthLargestOddNumber(int left, int right, int k) {
        int totalOdd = (right - left) / 2;
        if(left % 2 != 0 || right % 2 != 0) {
            totalOdd++;
        }
        if(k > totalOdd) {
            return 0;
        }
        if(right % 2 == 0) {
            return right - (2 * k) + 1;
        }
        else {
            return right - (2 * (k - 1));
        }
    }
    public static void main(String[] args) {
        int left = -3;
        int right = 3;
        int k = 1;
        System.out.println(kthLargestOddNumber(left, right, k));
    }
}