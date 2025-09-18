public class MergeSortString {
    public static void mergeSortString(String arr[], int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortString(arr, start, mid);
        mergeSortString(arr, mid + 1, end);
        mergeString(arr, start, mid, end);
    }
    public static void mergeString(String arr[], int start, int mid, int end) {
        String temp[] = new String[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end) {
            if(arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                k++;
                i++;
            }
            if(arr[i].compareTo(arr[j]) > 0) {
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
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergeSortString(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}