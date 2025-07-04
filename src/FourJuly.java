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


    }
}
