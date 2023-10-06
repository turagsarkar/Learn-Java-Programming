import java.util.Scanner;

public class DivideNum {
    public static void num() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        float num = input.nextFloat();
        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }


    }
}
