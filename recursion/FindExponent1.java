public class FindExponent1 {
    public static int calculateExponent(int base, int power) {
        if(power == 1) {
            return base;
        }
        return base * calculateExponent(base, power - 1);
    }
    public static void main(String[] args) {
        int base = 4;
        int power = 3;
        System.out.println(calculateExponent(base, power));
    }   
}