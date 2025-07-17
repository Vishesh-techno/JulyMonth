import java.util.HashMap;
import java.util.Map;

public class SeventeenJuly {
    public static int firstUniqueChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }

//        Map<Character, Integer> map1 = new HashMap<>();

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramUsingMap(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("aabbccd"));
        System.out.println(firstUniqueChar("aabbccddeffgg"));
        System.out.println(isAnagram("racecar", "racecar"));
        System.out.println(isAnagramUsingMap("racecar", "racecar"));
        System.out.println("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
