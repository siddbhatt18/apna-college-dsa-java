public class FastExponentiation {
    public static int fastExponent(int base, int power) {
        int ans = 1;
        while(power > 0) {
            if((power & 1) == 1) {
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;
        }
        return ans;
    }   
    public static void main(String[] args) {
        int base = 3;
        int power = 5;
        System.out.println(fastExponent(base, power)); 
    }
}