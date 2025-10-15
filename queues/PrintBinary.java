import java.util.*;
public class PrintBinary {
    public static void printBinary(int n) {
        Queue<String> que = new LinkedList<>();
        que.add("1");
        for(int i = 0; i < n; i++) {
            String str = que.remove();
            System.out.print(str + " ");
            que.add(str + "0");
            que.add(str + "1");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printBinary(n);
    }
}