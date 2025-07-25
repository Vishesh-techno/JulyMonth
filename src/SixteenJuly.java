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
    public static int[] shuffleArray(int[] nums, int n){
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[2*i]=nums[i];
            ans[2*i+1]= nums[i+n];
        }
        return ans;
    }
    public static void reverseString(String[] s){
        int start = 0;
        int end = s.length-1;
        while(start<end){
            String temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
    public static int reverseNumber(int x){
        int rev = 0;
        while(x!=0){
            int digit = x % 10;
            if(rev > Integer.MAX_VALUE/10){
                return 0;
            }
            if(rev == Integer.MAX_VALUE/10 && digit > 7){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev*10 + digit;
            x/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4,6};
        int tar = 6;
        int n = 2;
        System.out.println(Arrays.toString(twoSum(nums, tar)));
        System.out.println(Arrays.toString(twoSumBetter(nums, tar)));
        System.out.println(Arrays.toString(twoSumOptimal(nums, tar)));
        System.out.println(Arrays.toString(shuffleArray(nums, n)));
        String[] str = {"H","a","n","n","a","h"};
        reverseString(str);
        System.out.println(Arrays.toString(str));
        System.out.println(reverseNumber(123));

    }
}
