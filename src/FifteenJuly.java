import java.util.Arrays;

public class FifteenJuly {
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i] == 9){
                digits[i]=0;
            }else{
                digits[i]+=1;
                return digits;
            }
        }
        int[] res = new int[n+1];
        res[0]=1;
        return res;
    }
    public static void moveZerosBetter(int[] nums){
        int j=0;
        for(int num: nums){
            if(num!=0){
                nums[j] = num;
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
    public static void moveZeros(int[] nums){
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,0,0,9,9,9,8};
        int[] nums1 = {9,9,9,9,0,0,9,9,9,8};
        System.out.println(Arrays.toString(plusOne(nums)));
        moveZerosBetter(nums);
        System.out.println(Arrays.toString(nums));
        moveZeros(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
