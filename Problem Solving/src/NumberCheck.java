import java.util.Scanner;

public class NumberCheck {
    public static void div() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = input.nextInt();
        if ((num % 3 == 0) && (num % 2 == 0))
        {
            System.out.println("False");
        }
        else if ((num % 2 == 0)){
            System.out.println("True");
        }
        else if ((num % 3 == 0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
