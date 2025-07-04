public class FourJuly {
    public static void main(String[] args) {
        String str = "Vishesh Soni";
        String str1 = "Vishesh Soni";
        String str2 = new String("Vishesh Soni") ;
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println(str==str1);
        str.equals(str1);
        System.out.println(str.equals(str1));

    }
}
