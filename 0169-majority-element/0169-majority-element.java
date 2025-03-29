class Solution {
    public int majorityElement(int[] nums) {
        int el = 0, count = 0, n = nums.length;
        
        for(int i = 0; i<n; i++){
            if(count==0){
                count = count + 1;
                el = nums[i];
            }
            else if(nums[i] == el){
                count = count + 1;
                }
            else{
                count = count - 1;
            }
            }
            return el;
        }
    }
