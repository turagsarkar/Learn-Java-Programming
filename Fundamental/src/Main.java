import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to fundamental course!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Calling problem");
        int x = input.nextInt();
        System.out.println("Calling:"+x);
        if (x==0) {
            Input.input_number();
        }
    }
}