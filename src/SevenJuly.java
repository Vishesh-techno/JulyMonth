public class SevenJuly {
    public static int numOfStrings(String[] patterns, String word){
        int count = 0;
        for(String s : patterns){
            if(word.contains(s)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] sarr = {"a", "ab", "abc","d"};
        System.out.println(numOfStrings(sarr, "abc"));
    }
}
