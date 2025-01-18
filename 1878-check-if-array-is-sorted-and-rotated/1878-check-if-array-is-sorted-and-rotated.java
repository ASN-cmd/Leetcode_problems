class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 1, 2};

        Solution solution = new Solution();
        boolean isSorted = solution.check(nums);

        System.out.println(isSorted);
    }

    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

     
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

      
        return count <= 1;
    }
}
