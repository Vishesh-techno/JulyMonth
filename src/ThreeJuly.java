import java.util.Arrays;

public class ThreeJuly {
    public static int reachNumber(int target) {
        target = Math.abs(target);  // Because direction doesn't matter
        int sum = 0;
        int steps = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            steps++;
            sum += steps;
        }

        return steps;
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
        return nums;
    }

    public static void bubbleSortAsc(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 8, 41, 1, 4, 8, 5,};
        System.out.println(15);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
        bubbleSortAsc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
