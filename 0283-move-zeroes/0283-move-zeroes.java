import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int i;
        int j = -1;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }


        if (j == -1) {
            for (i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            return;   
        }

        for (i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
