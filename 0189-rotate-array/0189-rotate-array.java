import java.util.*;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
           nums[i] = sc.nextInt();
        } 

        int k = sc.nextInt();

        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int temp[] = new int[k];
        int j=0;

        for(int i=nums.length-k; i<nums.length; i++){
            temp[j] = nums[i];
            j++;
        }
        
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for(int i=0; i<k; i++){
            nums[i] = temp[i];
        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
        }
    }
}