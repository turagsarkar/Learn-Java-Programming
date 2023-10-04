import java.util.Scanner;

public class input {
    public static void input_number() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int number = input.nextInt();
        System.out.println("Number : "+number);
        System.out.println("Enter String :");
        String srt = input.next();
        System.out.println("Input String:"+srt);
        input.close();

    }
}
