import java.util.Arrays;

public class TwelveJuly {
    public static boolean areSentenceSimilar(String sentence1, String sentence2) {
        String[] array1 = sentence1.split(" ");
        String[] array2 = sentence2.split(" ");
        int index1 = 0;
        int index2 = 0;
        while (index1 < array1.length && index2 < array2.length && array1[index1].equals(array2[index2])) {
            index1++;
            index2++;
        }
        int end1 = array1.length - 1;
        int end2 = array2.length - 1;
        while (end1 >= index1 && end2 >= index2 && array1[end1].equals(array2[end2])) {
            end1--;
            end2--;
        }
        return index1 > end1 || index2 > end2;
    }

    public static void rotateArray(int[] nums, int k) {
        revNum(nums, 0, nums.length - 1);
        revNum(nums, 0, k - 1);
        revNum(nums, k, nums.length - 1);
    }

    public static void revNum(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateOptimal(int[] nums) {
       Arrays.sort(nums);
       for(int i=0; i<nums.length-1; i++){
           if(nums[i]==nums[i+1]){
               return false;
           }
       }
       return true;
    }



    public static void main(String[] args) {
        String s1 = "My Name is Vishesh Soni";
        String s2 = "My Father Name is Mukesh Soni";
        System.out.println(areSentenceSimilar(s1, s2));
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        rotateArray(nums, k);
        System.out.print("[");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("]");
        if(containsDuplicate(nums)){
            System.out.println("Duplicate is found");
        }else{
            System.out.println("Duplicate is not found");
        }
        if(!containsDuplicateOptimal(nums)){
            System.out.println("Duplicate is found");
        }else{
            System.out.println("Duplicate is not found");
        }

    }
}
