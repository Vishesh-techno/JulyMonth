import java.util.Scanner;

public class TwoJuly {
    public static void evenAndOdd(int n){
        if(n%2==0){
            System.out.println("The given no. is Even");
        }
        System.out.println("The given no. is Odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n = sc.nextInt();
        evenAndOdd(n);
    }
}
