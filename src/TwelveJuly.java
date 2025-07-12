public class TwelveJuly {
    public static boolean areSentenceSimilar(String sentence1, String sentence2) {
        String[] array1 = sentence1.split(" ");
        String[] array2 = sentence2.split(" ");
        int index1 = 0;
        int index2 = 0;
        while (index1 < array1.length && index2 < array2.length && array1[index1].equals(array2[index2])) {
            index1++;
            index2++;
        }
        int end1 = array1.length - 1;
        int end2 = array2.length - 1;
        while (end1 >= index1 && end2 >= index2 && array1[end1].equals(array2[end2])) {
            end1--;
            end2--;
        }
        return index1 > end1 || index2 > end2;
    }

    public static void main(String[] args) {
        String s1 = "My Name is Vishesh Soni";
        String s2 = "My Father Name is Mukesh Soni";
        System.out.println(areSentenceSimilar(s1, s2));
    }
}
