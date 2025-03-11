class Solution {
    
    public static int missingNumber(int[] nums) {
        int sum1;
        int sum2 = 0;
        sum1 = ((nums.length*(nums.length+1))/2);
        for(int i = 0; i < nums.length; i++){
            sum2 = sum2 + nums[i];
        }
        int ans = sum1 - sum2;
        return ans;
    }
}