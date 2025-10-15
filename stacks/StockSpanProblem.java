import java.util.*;
public class StockSpanProblem {
    public static void solveStockSpan(int stock[], int span[]) {
        Stack<Integer> stk = new Stack<>();
        span[0] = 1;
        stk.push(0);
        for(int i = 1; i < stock.length; i++) {
            while(stk.isEmpty() != true && stock[i] > stock[stk.peek()]) {
                stk.pop();
            }
            if(stk.isEmpty() == true) {
                span[i] = i + 1;
            }
            else {
                span[i] = i - stk.peek();
            }
            stk.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];
        solveStockSpan(stock, span);
        for(int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}