public class FunctionOverloading2 {
    public static int sum(int x, int y) {
        return (x + y);
    }
    public static int sum(int x, int y, int z) {
        return (x + y + z);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 60;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
    }
}