import java.util.Scanner;

public class Count_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an interger: ");
        int number = 1000;

        int count = String.valueOf(number).length();
        System.out.println("Number of digits in " + number + " is: " + count);

         scanner.close();
    }
}
