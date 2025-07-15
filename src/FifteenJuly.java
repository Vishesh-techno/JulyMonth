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
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
