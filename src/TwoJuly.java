public class TwoJuly {
    public static int findMin(int[] nums){
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid =  start + (end-start)/2;
            if(nums[start]>nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[start]>nums[mid]&&nums[mid]<nums[end]){
                return nums[mid];
            }
        }
        return nums[start];
    }
    public static int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println("The index of Minimum is: "+findMin(nums));
        System.out.println("The index of peak element in array is: " + findPeakElement(nums));
    }
}
