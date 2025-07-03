import java.util.Scanner;

public class ThreeJulyBasics {
    public static double areaOfCircle(int n) {
        return 3.14 * n * n;
    }

    public static void areaCircle() {
        Scanner sc = new Scanner(System.in);
        double area = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter radius " + i + ": ");
            double radius = sc.nextDouble();

            if (radius > 0) {
                area = Math.PI * radius * radius;
                System.out.println("Area of circle = " + area);
            } else {
                System.out.println("Invalid radius. Must be positive.");
            }
        }
    }

    public static double areaOfTriangle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();

        if (length > 0 && breadth > 0) {
            double area = 0.5 * length * breadth;
            System.out.println("Area of triangle = " + area);
            return area;
        } else {
            System.out.println("Length and breadth must be greater than 0.");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a Circle: ");
        int n = sc.nextInt();
        System.out.println("The area of a circle of a " + n + " Radius: " + areaOfCircle(n));
        areaCircle();
        areaOfTriangle();
    }
}
