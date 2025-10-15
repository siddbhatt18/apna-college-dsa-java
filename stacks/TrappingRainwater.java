import java.util.*;
public class TrappingRainwater {
    public static int trappedRainwater(int arr[]) {
        Stack<Integer> stk = new Stack<>();
        int totalWater = 0;
        for(int i = 0; i < arr.length; i++) {
            while(stk.isEmpty() != true && arr[i] > arr[stk.peek()]) {
                int valley = stk.pop();
                if(stk.isEmpty() == true) {
                    break;
                }
                int width = i - stk.peek() - 1;
                int height = Math.min(arr[i], arr[stk.peek()]) - arr[valley];
                totalWater = totalWater + (width * height);
            }
            stk.push(i);
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(arr));
    }
}
