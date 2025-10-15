public class InversionCount {
    public static int findMerge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int count = 0;
        int i = start;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            }
            else {
                temp[k] = arr[j];
                count = count + (mid - i + 1);
                k++;
                j++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j <= end) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        int idx = start;
        for(k = 0; k < temp.length; k++) {
            arr[idx] = temp[k];
            idx++;
        }
        return count;
    }
    public static int findInversion(int arr[], int start, int end) {
        int count = 0;
        if(start < end) {
            int mid = (start + end) / 2;
            count = count + findInversion(arr, start, mid);
            count = count + findInversion(arr, mid + 1, end);
            count = count + findMerge(arr, start, mid, end);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(findInversion(arr, 0, arr.length - 1));
    }
}