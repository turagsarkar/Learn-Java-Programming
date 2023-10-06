import java.util.Scanner;

public class CheckNumber {
    public static void condition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();
        if(num > 0)
        {
            System.out.println("Number is POSITIVE");
        }
        else if(num < 0)
        {
            System.out.println("Number is NEGATIVE");
        }
        else
        {
            System.out.println("Number is ZERO");
        }
        input.close();
    }
}
