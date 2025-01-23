import java.util.*;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        missingNumber(nums);
    }

    public static int missingNumber(int[] nums) {
        int flag;
        for(int i=1; i<=nums.length; i++){
            flag=0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return 0;
    }
}
