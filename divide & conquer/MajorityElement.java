public class MajorityElement {
    public static int findMajorityElement(int arr[], int start, int end) {
        if(start == end) {
            return arr[start];
        }
        int mid = (start + end) / 2;
        int leftMajority = findMajorityElement(arr, start, mid);
        int rightMajority = findMajorityElement(arr, mid + 1, end);
        if(leftMajority == rightMajority) {
            return leftMajority;
        }
        int leftCount = countInRange(arr, leftMajority, start, end);
        int rightCount = countInRange(arr, rightMajority, start, end);
        return Math.max(leftCount, rightCount);
    }
    public static int countInRange(int arr[], int key, int start, int end) {
        int count = 0;
        for(int i = start; i <= end; i++) {
            if(arr[i] == key) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.print(findMajorityElement(arr, 0, arr.length - 1));       
    }
}