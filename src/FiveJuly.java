public class FiveJuly {
    //    Goal Parser Interpretation
    public static String goalInterpretation(String s) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i <= s.length()) {
            if (s.charAt(i) == 'G') {
                str.append('G');
                i++;
            } else {
                if (s.charAt(i + 1) == ')') {
                    str.append('o');
                    i += 2;
                } else {
                    str.append("al");
                    i += 4;
                }
            }
        }
        return str.toString();
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s1 : word1) {
            sb1.append(s1);
        }
        for (String s2 : word2) {
            sb2.append(s2);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static String toLowerCase(String s){
//        for any lowercase value you need to add 32 because the alphabet in ASCII
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >='A' && ch<='Z'){
                result.append((char)(ch+32));
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "G()()al";
        String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};
        System.out.println(goalInterpretation(s));
        System.out.println(arrayStringsAreEqual(s1, s2));
        System.out.println(s);
        System.out.println(toLowerCase(s));
    }
}
