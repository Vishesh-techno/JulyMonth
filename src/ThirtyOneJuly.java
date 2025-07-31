public class ThirtyOneJuly {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int tot = numbers[left] + numbers[right];
            if (tot == target) {
                return new int[] { left + 1, right + 1 };
            } else if (tot > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
    }
}
