import java.util.Scanner;

public class Calculator {
    public static void  calculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two value and operator:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        char c = input.next().charAt(0);
        double result = 0;
        switch (c) {
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
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("value:"+result);
    }
}
