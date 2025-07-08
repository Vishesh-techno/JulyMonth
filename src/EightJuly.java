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

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        if (validPalindrome(input)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}
