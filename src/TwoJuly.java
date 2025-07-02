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
//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static int simpleIntrest(int principle, int rate, int time){
//        Scanner sc = new Scanner(System.in);
//        principle = sc.nextInt();
//        rate = sc.nextInt();
//        intrest = sc.nextInt();
        int SI = (principle*rate*time)/100;
        return SI;
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
        System.out.println("Welcome back " + str);
        System.out.print("Enter the principle amount: ");
        int P = sc.nextInt();
        System.out.print("Enter the rate amount: ");
        int R = sc.nextInt();
        System.out.print("Enter the time: ");
        int T = sc.nextInt();
        System.out.println(simpleIntrest(P,R,T));
    }
}
