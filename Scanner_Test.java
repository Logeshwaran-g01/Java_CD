import java.util.Scanner;

public class Scanner_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        System.out.println("Original Value:");
        System.out.println("First Number:" + num1);
        System.out.println("Second Number:" + num2);

        double temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("/nAfter number:");
        System.out.println("First Number:" + num1);
        System.out.println("Second Number:" + num2);

        scanner.close();
    }
}
