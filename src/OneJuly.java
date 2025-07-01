public class OneJuly {
    public static int searchInRotatedSorted(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a + b);
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println("the index of target array " + target + " is: " + searchInRotatedSorted(nums, target));
    }
}
