public class ThirtyJuly {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length + 1];
        res[0]=1;
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]+=1;
                return digits;
            }
        }
        return res;
    }

    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            cs = cs + nums[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
            if(nums[i] > maxElement){
                maxElement = nums[i];
            }
        }
        if(ms == 0 && maxElement < 0){
            return maxElement;
        }
        return ms;
    }
    public static void main(String[] args) {

    }
}
