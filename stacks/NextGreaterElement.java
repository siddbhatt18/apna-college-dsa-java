import java.util.*;
public class NextGreaterElement {
    public static void nextGreaterElement(int arr[], int nextGreater[]) {
        Stack<Integer> stk = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(stk.isEmpty() != true && arr[i] >= arr[stk.peek()]) {
                stk.pop();
            }
            if(stk.isEmpty() == true) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[stk.peek()];
            }
            stk.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreater[] = new int[arr.length];
        nextGreaterElement(arr, nextGreater);
        for(int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}