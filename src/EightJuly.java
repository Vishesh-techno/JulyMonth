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
    }
}
