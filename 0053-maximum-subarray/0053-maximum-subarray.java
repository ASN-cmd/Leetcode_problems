class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = -99999999;
        int sum = 0, n=nums.length;

        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            maxi = Math.max(sum, maxi);

            if(sum < 0){
                sum = 0;
            }
            
        }
        return maxi;
    }
}