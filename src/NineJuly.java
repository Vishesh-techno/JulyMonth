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

    public static void main(String[] args) {
        String str = "ababaabababacab";
        String word = "ab";
        System.out.println(maxRepeating(str, word));
        System.out.println(maxRepeatingOptimal(str, word));
        System.out.println(hasConsecutiveOnes("10"));
        System.out.println(hasConsecutiveOnesOptimal("10"));
        System.out.println(hasConsecutiveOnesmostOptimal("1001"));
    }
}
