import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FourteenJuly {
    public static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int num: nums1){
            s1.add(num);
        }
        for(int num: nums2){
            s2.add(num);
        }
        int[] res = new int[Math.max(s1.size(), s2.size())];
        int k = 0;
        for(int num: s1){
            if(s2.contains(num)){
                res[k] = num;
                k++;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
    public static void main(String[] args) {
        int[] nums1 = {4,2,4,5,4};
        int[] nums2 = {4,5,4,5,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
