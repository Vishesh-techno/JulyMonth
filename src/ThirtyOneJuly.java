import java.util.Arrays;

public class ThirtyOneJuly {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int tot = numbers[left] + numbers[right];
            if (tot == target) {
                return new int[]{left + 1, right + 1};
            } else if (tot > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    public static boolean isPerfectSquare(int num) {
        long start = 2;
        long end = num / 2;
        if (num < 2) {
            return true;
        }
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static int arrangeCoins(int n) {
        long sum = n;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            sum -= i;
            if (sum < 0) {
                return i - 1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(isPerfectSquare(target));
        System.out.println(arrangeCoins(target));
    }
}
