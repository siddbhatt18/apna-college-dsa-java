public class FunctionOverloading1 {
    public static int sum(int x, int y) {
        return (x + y);
    }
    public static float sum(float x, float y) {
        return (x + y);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        float c = 60.0f;
        float d = 15.5f;
        System.out.println(sum(a, b));
        System.out.println(sum(c, d));
    }
}