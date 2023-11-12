import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("It's a simple Calculator..!!");
        System.out.println("Enter First Number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second Number:");
        double num2 = sc.nextDouble();

        System.out.println("Select operation:");
        System.err.println("1.Addition (+)");
        System.out.println("2.Substraction (-)");
        System.out.println("3.Multiplication (*)");
        System.out.println("Division (/)");
        
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            
            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 + num2;
                break;

            case 4:
                if(num2!=0)
                {
                    result = num1 / num2;
                }
                else
                {
                    System.out.println("Error:Divided by Zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!! Please try again...");
                break;
        }

        System.out.println("Result: "+result);
    }
}
