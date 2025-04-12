class Solution {
    public int findMin(int[] nums) {
        int n = nums.length, low = 0, high = n-1, min = nums[0]; 

        while(low <= high){
            int mid = (low + high)/2;
            
            //Left sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] < min){
                    min = nums[low];
                    low = mid + 1;
                }
                else
                    low = mid + 1;
            }
            //Right sorted
            else{
                if(nums[mid] < min){
                    min = nums[mid];
                    high = mid - 1;
                }
                else
                    high = mid - 1;
            }
                    
            
        }
        return min;
    }
}