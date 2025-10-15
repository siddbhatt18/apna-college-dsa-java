public class FindExponent2 {
    public static int calculateExponent(int base, int power) {
        if(power == 1) {
            return base;
        }
        int halfPower = calculateExponent(base, power / 2);
        if(power % 2 == 0) {
            return halfPower * halfPower;
        }
        else {
            return base * halfPower * halfPower;
        }
    }
    public static void main(String[] args) {
        int base = 5;
        int power = 3;
        System.out.println(calculateExponent(base, power));
    }
}