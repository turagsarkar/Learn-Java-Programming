import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Circle {
    public static void circle_problem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the center point:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.println("Enter the radius value:");
        int radius = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        if((x2 - x1) * (x2 - x1) +
                (y2 - y1) * (y2 - y1) <= radius * radius){
            System.out.println("Inside Circle");
        }
        else {
            System.out.println("OUTSIDE circle");
        }

    }

}
