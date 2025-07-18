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

    public static boolean searchInRotatedSortedBoolean(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchInRotatedSortedBooleanOptimal(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
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
        return false;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a + b);
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int[] arr = {1, 0, 1, 1, 1};
        int target1 = 0;
        System.out.println("the index of target array " + target + " is: " + searchInRotatedSorted(nums, target));
        System.out.println("the boolean of target array " + target + " is: " + searchInRotatedSortedBoolean(nums, target));
        System.out.println("the boolean of target array " + target1 + " is: " + searchInRotatedSortedBooleanOptimal(arr, target1));
    }
}
