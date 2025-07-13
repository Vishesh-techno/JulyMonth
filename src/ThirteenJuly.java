public class ThirteenJuly {
    public static int singleNumber(int[] nums){
        int res = 0;
        for(int num : nums){
            res = res ^ num;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,1,2};
        System.out.println(singleNumber(nums));
    }
}
