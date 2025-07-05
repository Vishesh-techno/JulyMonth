import java.util.Arrays;
import java.util.Scanner;

public class FourJuly {
    public static String ipv4Address(String address){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<address.length(); i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                result.append("[.]");
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
//    Shuffle String
    public static String shuffleString(String s, int[] indices){
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
    public static void main(String[] args) {
//        String str = "Vishesh Soni";
//        String str1 = "Vishesh Soni";
//        String str2 = new String("Vishesh Soni") ;
//        System.out.println(str==str2);
//        System.out.println(str.equals(str2));
//        System.out.println(str==str1);
//        str.equals(str1);
//        System.out.println(str.equals(str1));
//        System.out.println(str.charAt(0));
//        System.out.println(5+5+"vishesh");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the IP address: ");
        String str = sc.nextLine();
        System.out.println(ipv4Address(str));
        String s = "visheshSoni";
        int[] indices =  {2,3,1,0,4,5,6,7,8,9,10};
        System.out.println(shuffleString(s, indices));



    }
}
