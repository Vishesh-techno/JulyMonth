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
    public static String freqAlphabet(String s){
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            if(s.charAt(i) == '#'){
                int num = Integer.parseInt(s.substring(i-2,i));
                sb.append((char)('a' + num-1));
                i = i-3;
            }else{
                int num = s.charAt(i) - '0';
                sb.append((char)('a' + num - 1));
                i--;
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        System.out.println(vowelsInHalfAreLikes(s));
        System.out.println(halvesAreAlike(s));
        System.out.println(freqAlphabet("22#919#8519#8"));
    }
}
