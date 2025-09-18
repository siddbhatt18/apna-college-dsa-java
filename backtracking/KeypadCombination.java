import java.util.*;
public class KeypadCombination {
    static char keypad[][] = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public static void findCombination(int idx, String str, StringBuilder result) {
        if(idx == str.length()) {
            System.out.print(result.toString() + " ");
            return;
        }
        int digit = Character.getNumericValue(str.charAt(idx));
        if(digit == 0 || digit == 1) {
            return;
        }
        for(int i = 0; i < keypad[digit].length; i++) {
            result.append(keypad[digit][i]);
            findCombination(idx + 1, str, result);
            result.deleteCharAt(result.length() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder("");
        findCombination(0, str, result);
        sc.close();
    }
}