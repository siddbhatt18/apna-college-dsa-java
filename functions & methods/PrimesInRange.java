public class PrimesInRange {
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int p) {
        for(int i = 1; i <= p; i++) {
            if(isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 10;
        primesInRange(n);
    }
}