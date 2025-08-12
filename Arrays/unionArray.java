import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,1};

        Solution.sortColors(nums);
    }
}
class Solution {
    public static void sortColors(int[] nums) {
        int j = 0,k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                Swap(nums, i, j,k);
            }
        }
        //print nums
//        for (int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
    }
    public static void Swap(int[] nums, int i, int j, int k) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j++] = temp;
        k++;
        for(int m=0;m<j;m++){
            System.out.println(nums[m]);
        }
    }
}