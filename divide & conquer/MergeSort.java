public class MergeSort {
    public static void mergeSort(int arr[], int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
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
                k++;
                j++;
            }
        }
        while(i <= mid) {
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
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}