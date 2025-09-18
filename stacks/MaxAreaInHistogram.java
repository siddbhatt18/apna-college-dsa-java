import java.util.*;
public class MaxAreaInHistogram {
    public static int calculateMaxArea(int arr[]) {
        int nextSmallLeft[] = new int[arr.length];
        int nextSmallRight[] = new int[arr.length];
        Stack<Integer> stk1 = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(stk1.isEmpty() != true && arr[i] <= arr[stk1.peek()]) {
                stk1.pop();
            }
            if(stk1.isEmpty() == true) {
                nextSmallLeft[i] = -1;
            }
            else {
                nextSmallLeft[i] = stk1.peek();
            }
            stk1.push(i);
        }
        Stack<Integer> stk2 = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(stk2.isEmpty() != true && arr[i] <= arr[stk2.peek()]) {
                stk2.pop();
            }
            if(stk2.isEmpty() == true) {
                nextSmallRight[i] = arr.length;
            }
            else {
                nextSmallRight[i] = stk2.peek();
            }
            stk2.push(i);
        }
        int maxArea = 0;
        for(int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nextSmallRight[i] - nextSmallLeft[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println(calculateMaxArea(arr));
    }
}