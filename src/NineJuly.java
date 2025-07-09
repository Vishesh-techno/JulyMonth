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

    public static void main(String[] args) {
        String str = "ababaabababacab";
        String word = "ab";
        System.out.println(maxRepeating(str, word));
        System.out.println(maxRepeating(str, word));
    }
}
