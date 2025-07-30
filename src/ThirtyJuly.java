import java.util.Arrays;

public class ThirtyJuly {
    public static int[] plusOne(int[] digits) {
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        return res;
    }

    public static int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }
        if (ms == 0 && maxElement < 0) {
            return maxElement;
        }
        return ms;
    }

    public static  int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println(Arrays.toString(buildArray(nums)));
        System.out.println(maxSubArray(nums));


    }
}
