public class PowerOfTwo {
    public static boolean checkPower(int num) {
        int var = num - 1;
        if((num & var) == 0) {
            return true;
        } 
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 8;
        System.out.println(checkPower(num));
    }
}