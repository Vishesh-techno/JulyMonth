import java.util.Scanner;

public class SixJuly {
    public static boolean vowelsInHalfAreLikes(String s) {
        int count_vowels1 = 0;
        int count_vowels2 = 0;
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count_vowels1++;
            }
        }
        for (int i = n - 1; i > n / 2; i--) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count_vowels2++;
            }
        }
        return count_vowels1 == count_vowels2;
    }

    public static boolean halvesAreAlike(String s) {
        int n = s.length() / 2;
        return vowels(s.substring(0, n)) == vowels(s.substring(n, s.length()));
    }

    public static int vowels(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        System.out.println(vowelsInHalfAreLikes(s));
        System.out.println(halvesAreAlike(s));
    }
}
