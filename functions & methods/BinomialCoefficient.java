public class BinomialCoefficient {
    public static int findFactorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int findBC(int n, int r) {
        int nFact = findFactorial(n);
        int rFact = findFactorial(r);
        int nmrFact = findFactorial(n - r);
        int bc = nFact / (rFact * nmrFact);
        return bc;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(findBC(n, r));
    }
}