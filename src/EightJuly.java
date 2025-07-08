
public class EightJuly {
    public static boolean validPalindrome(String s) {
        String s1 = s.replaceAll("[\\s,]", "").toLowerCase();  // Remove spaces and commas
        char[] ch = s1.toCharArray();

        int start = 0, end = ch.length - 1;

        while (start < end) {
            if (ch[start] != ch[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static boolean validPalindromeBetter(String s) {
        String s1 = s.replaceAll("[\\s,]", "").toLowerCase();  // Remove spaces and commas
//        char[] ch = s1.toCharArray();

        int start = 0, end = s1.length() - 1;

        while (start < end) {
            if (s1.charAt(start) != s1.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static boolean validPalindromeII(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return isPalindrome(s, start+1, end) || isPalindrome(s , start , end-1);
            }
        }
        return true;
    }
    private static boolean isPalindrome(String s, int start, int end){
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        if (validPalindrome(input)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
        if (validPalindromeBetter(input)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
        System.out.println(strStr("sadbutsad", "sad"));
        String str = "deeee";
        System.out.println(validPalindromeII(str));
        if (validPalindromeII(str)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
        String[] str2 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str2));
    }
}
