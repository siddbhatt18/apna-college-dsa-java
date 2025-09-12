public class TrappingRainwater {
    public static int trappedRainwater(int arr[]) {
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for(int j = arr.length - 2; j >= 0; j--) {
            rightMax[j] = Math.max(arr[j], rightMax[j + 1]);
        }
        int collectedWater = 0;
        for (int k = 0; k < arr.length; k++) {
            int waterLevel = Math.min(leftMax[k], rightMax[k]);
            int trappedWater = waterLevel - arr[k];
            collectedWater = collectedWater + trappedWater;
        }
        return collectedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(arr));
    }
}