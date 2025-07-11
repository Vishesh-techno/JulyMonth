import java.util.Arrays;

public class ElevenJuly {
    // Om namah Shivay
    public static boolean canReach(String s, int minJump, int maxJump){
        char[] ch = s.toCharArray();
        int start = 0;
        int n = ch.length;

        while (start < n) {
            if (start == n - 1) return true;

            boolean jumped = false;
            for (int j = start + minJump; j <= Math.min(start + maxJump, n - 1); j++) {
                if (ch[j] == '0') {
                    start = j;
                    jumped = true;
                    // break;
                }
            }

            if (!jumped) return false;
        }

        return false;
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (isPalindrome(a.substring(0, i) + b.substring(i)) ||
                    isPalindrome(b.substring(0, i) + a.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int k = 1;
        for (int i=1; i<n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        return l >= r;
    }
    public static void main(String[] args) {
        System.out.println(canReach("011010", 2, 3));
        System.out.println(checkPalindromeFormation("abcdef", "abcdef"));
        int[] array = {0,0,1,1,1,2,2,3,3,};
        System.out.println(Arrays.toString(array));
        System.out.println(removeDuplicates(array));
    }
}
