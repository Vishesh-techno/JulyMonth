public class TenJuly {
    public static String reversePrefix(String word, char ch){
        int index = word.indexOf(ch);
        if(index==-1){
            return word;
        }
        char[] ch1 = word.toCharArray();
        int left = 0;
        int right = index;
        while (left<right){
            char temp = ch1[left];
            ch1[left] = ch1[right];
            ch1[right] = temp;
            left++;
            right--;
        }
        return new String(ch1);
    }

    public static boolean isValid(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left<right){
            if((ch[left]=='{' && ch[right] != '}')||(ch[left]=='[' && ch[right] != ']')||(ch[left]=='(' && ch[right] != ')')){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(isValid("{[()]}"));
        System.out.println(isValid("{[()()]}"));
    }
}
