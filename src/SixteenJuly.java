import java.util.Arrays;

public class SixteenJuly {
    public static int[] twoSum(int[] nums, int target){
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+nums[i+1]==target){
                res = new int[]{i,i+1};
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int tar = 6;
        System.out.println(Arrays.toString(twoSum(nums, tar)));
    }
}
