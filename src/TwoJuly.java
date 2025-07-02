import java.util.Scanner;

public class TwoJuly {
//    Write a program to print whether a number is even or odd, also take input from the user.
    public static void evenAndOdd(int n){
        if(n%2==0){
            System.out.println("The given no. is Even");
        }else{
        System.out.println("The given no. is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n = sc.nextInt();
        evenAndOdd(n);
        sc.nextLine();
//        Take name as input and print a greeting message for that particular name.
        System.out.print("Enter the Name: ");
        String str = sc.nextLine();
        System.out.print("Welcome back " + str);
    }
}
