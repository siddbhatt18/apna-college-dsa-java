import java.util.*;
public class BalancedParanthesis {
    public static void paranthesis(ArrayList<String> result, String current, int open, int close) {
        if(open == 0 && close == 0) {
            result.add(current);
            return;
        }
        if(open > 0) {
            paranthesis(result, current + "{", open - 1, close);
        }
        if(close > open) {
            paranthesis(result, current + "}", open, close - 1);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> result = new ArrayList<>();
        paranthesis(result, "", n, n);
        for(String str : result) {
           System.out.print(str + " ");
        }
    }
}