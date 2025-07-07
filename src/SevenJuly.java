public class SevenJuly {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns) {
            if (word.contains(s)) {
                count++;
            }
        }
        return count;
    }

    public static String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String words : word){
            sb.append(new StringBuilder(words).reverse().append(" "));
        }
        return sb.toString();
    }
    public static boolean jugdeCircle(String moves){
        int n = 0;
        int n1 = 0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch=='U'){
                n += 1;
            }else if(ch=='D'){
                n -= 1;
            }else if(ch=='L'){
                n1 -= 1;
            }else{
                n1 += 1;
            }
        }
        return (n==0&&n1==0);
    }
    public static void main(String[] args) {
        String[] sarr = {"a", "ab", "abc", "d"};
        System.out.println(numOfStrings(sarr, "abc"));
        String str = "Vishesh is Learning Java";
        System.out.println(reverseWords(str));
        String str1 = "UDUDUDUDUDDLRLRRRLLRRRL";
        System.out.println(jugdeCircle(str1));
        System.out.println(701/26);
        System.out.println('a' + 25);
    }
}
