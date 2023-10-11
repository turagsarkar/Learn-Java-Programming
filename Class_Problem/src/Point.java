import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Point {
    public static void euq() {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int distance = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        System.out.printf("Distance between the said points: %.4f", sqrt(distance));

    }
}
