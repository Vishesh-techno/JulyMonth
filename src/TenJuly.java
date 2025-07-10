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

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }
}
