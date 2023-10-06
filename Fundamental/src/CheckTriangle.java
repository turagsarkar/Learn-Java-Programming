import java.util.Scanner;

public class CheckTriangle {
    public static void triangle() {
        System.out.println("Enter the angle value:");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float sum= a+b+c;
        if(sum == 180 )
        {
            System.out.println("Triangle is valid.");
        }
        else
        {
            System.out.println("Triangle is not valid.");
        }

    }
}
