import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    public static int[] twoSumBetter(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int lookUpNumber = target - nums[i];
            if(map.containsKey(lookUpNumber) && map.get(lookUpNumber)!=i){
                return new int[]{
                        map.get(lookUpNumber), i
                };
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int lookUpNumber = target - nums[i];

            if(map.containsKey(lookUpNumber)){
                return new int[]{i, map.get(lookUpNumber)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int tar = 6;
        System.out.println(Arrays.toString(twoSum(nums, tar)));
        System.out.println(Arrays.toString(twoSumBetter(nums, tar)));
        System.out.println(Arrays.toString(twoSumOptimal(nums, tar)));
    }
}
