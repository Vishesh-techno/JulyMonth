import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SeventeenJuly {
    public static int firstUniqueChar(String s){
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
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
        for (int i=0; i<s.length(); i++) {
           count[s.charAt(i)-'a']++;
        }
        for (int i=0; i<t.length(); i++) {
            count[t.charAt(i)-'a']--;
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
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c: t.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c: map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("aabbccd"));
        System.out.println(firstUniqueChar("aabbccddeffgg"));
    }
}
