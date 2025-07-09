public class NineJuly {
    public static int maxRepeating(String sequence, String word) {
        String repeated = word;
        int count = 0;
        while (sequence.contains(repeated)) {
            count++;
            repeated = repeated + word;
        }
        return count;
    }
    public static int maxRepeatingOptimal(String sequence, String word){
        StringBuilder sb = new StringBuilder(word);
        int count = 0;
        while (sequence.contains(sb)){
            count++;
            sb.append(word);
        }
        return count;
    }
    public static boolean hasConsecutiveOnes(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        if(ch[ch.length-1]=='1'){
            count = 1;
        }else{
            count = 0;
        }
        for(int i=0; i<ch.length; i++){
            if (ch[i] == '1'&&ch[i+1] != '1'){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean hasConsecutiveOnesOptimal(String s) {
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)=='0' && s.charAt(i)=='1'){
                return false;
            }
        }
        return true;
    }
    public static boolean hasConsecutiveOnesmostOptimal(String s) {
       return !s.contains("01");
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word1.length()||i<word2.length(); i++){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String mergeAlternatelyOptimal(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        while(i<ch1.length && j<ch2.length){
            sb.append(ch1[i]);
            sb.append(ch2[j]);
            i++;
            j++;
        }
        while(i<ch1.length){
            sb.append(ch1[i]);
            i++;
        }
        while(j<ch2.length){
            sb.append(ch1[j]);
            j++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "ababaabababacab";
        String word = "ab";
        System.out.println(maxRepeating(str, word));
        System.out.println(maxRepeatingOptimal(str, word));
        System.out.println(hasConsecutiveOnes("10"));
        System.out.println(hasConsecutiveOnesOptimal("10"));
        System.out.println(hasConsecutiveOnesmostOptimal("1001"));
        System.out.println(mergeAlternately("abc", "abc"));
        System.out.println(mergeAlternatelyOptimal("abc", "abc"));

    }
}
