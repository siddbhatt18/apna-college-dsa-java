class Solution {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            total = total + nums[i];
            max = Math.max(max, total);
            if(total < 0) {
                total = 0;
            }
        }
        return max;
    }
}
