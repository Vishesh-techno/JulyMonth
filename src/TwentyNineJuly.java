import java.util.ArrayList;
import java.util.Arrays;

public class TwentyNineJuly {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sm = 0;
        for(int i=0; i<n; i++){
            sm = 0;
            for(int j=0; j<n; j++){
                if(nums[j]<nums[i]){
                    sm++;
                }
            }
            ans[i] = sm;
        }
        return ans;
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] ans = new int[list.size()];
        for(int i=0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] num = {8,1,2,2,3};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(num)));
    }
}
