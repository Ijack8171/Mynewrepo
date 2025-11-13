public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
//dev2 added the new code 
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            sc.close();
        }
    }
}
new code developed by dev2 with out pull the code


    doing automatic things to trigger the job wiht the webhook
