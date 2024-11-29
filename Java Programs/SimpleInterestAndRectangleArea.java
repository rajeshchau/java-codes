import java.util.Scanner;

public class SimpleInterestAndRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate Simple Interest
        System.out.println("Simple Interest Calculation:");
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        // Calculate Area of Rectangle
        System.out.println("\nRectangle Area Calculation:");
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Area of Rectangle: " + area);

        scanner.close();
    }
}
