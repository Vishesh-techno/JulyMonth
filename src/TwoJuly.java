import java.util.Calendar;
import java.util.Scanner;

public class TwoJuly {
    //    Write a program to print whether a number is even or odd, also take input from the user.
    public static void evenAndOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("The given no. is Even");
        } else {
            System.out.println("The given no. is Odd");
        }
    }

    //    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static int simpleIntrest(int principle, int rate, int time) {
//        Scanner sc = new Scanner(System.in);
//        principle = sc.nextInt();
//        rate = sc.nextInt();
//        intrest = sc.nextInt();
        int SI = (principle * rate * time) / 100;
        return SI;
    }

    //    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static int calculator(int a, int b) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Cannot be divide by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        return result;
    }

    //    Take 2 numbers as input and print the largest number.
    public static int largest(int n, int m) {
        if (n < m) {
            return m;
        }
        return n;
    }

    //    Input currency in rupees and output in USD.
    public static double currencyConverter(double Rs) {
        double USD = 85.75;
        double result = Rs / USD;
        return result;
    }

    public static double currencyConverterIndia(double Rs) {
        double USD = 85.75;
        double result = Rs * USD;
        return result;
    }

    //    To calculate Fibonacci Series up to n numbers.
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series is: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void palindrome(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n = sc.nextInt();
        evenAndOdd(n);
        sc.nextLine();
//        Take name as input and print a greeting message for that particular name.
//        System.out.print("Enter the Name: ");
//        String str = sc.nextLine();
//        System.out.println("Welcome back " + str);
//        System.out.print("Enter the principle amount: ");
//        int P = sc.nextInt();
//        System.out.print("Enter the rate amount: ");
//        int R = sc.nextInt();
//        System.out.print("Enter the time: ");
//        int T = sc.nextInt();
//        System.out.println(simpleIntrest(P,R,T));
//        System.out.println("Enter the value of a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b: ");
//        int b = sc.nextInt();
//        System.out.println("Result: " + calculator(a,b));
//        System.out.println("Largest is: " + largest(a, b));
        System.out.print("Enter the Rupees: ");
        double Rs = sc.nextDouble();
        System.out.println("The USD in " + Rs + " Rupees is: " + currencyConverter(Rs));
        System.out.print("Enter the USD: ");
        double Rs1 = sc.nextDouble();
        System.out.println("The USD in " + Rs1 + " Rupees is: " + currencyConverterIndia(Rs1));
        System.out.println("Enter the no. of terms for Fibonacci Series: ");
        int n1 = sc.nextInt();
        fibonacciSeries(n1);
        System.out.println();
        sc.nextLine();
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        palindrome(str);

    }
}
