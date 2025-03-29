class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        // declaring a hashmap
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++){
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i],value+1);
        }

        for(Map.Entry<Integer, Integer> it: mpp.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }
        }
        return -1;

    }
}