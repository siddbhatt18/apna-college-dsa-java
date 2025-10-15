public class CheckDuplicate {
    public static boolean checkDuplicate(int arr[]) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count >= 2) {
                return true;
            }
        }
        return false;
    }   
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 2};
        System.out.println(checkDuplicate(arr));
    }
}