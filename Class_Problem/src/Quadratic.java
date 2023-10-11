import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Quadratic {
    public static void equation() {
        System.out.println("Enter  a ,b ,c: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double root1 , root2 ;
        float discriminant = (b * b) - (4 * a * c);
        if(discriminant > 0)
        {
            root1 = (-b + sqrt(discriminant)) / (2*a);
            root2 = (-b - sqrt(discriminant)) / (2*a);

            System.out.println("The equation has two roots "+root1+" and "+root2);
        }
        else if(discriminant == 0)
        {
            root1 = root2 = -b / (2 * a);
            System.out.println("The equation has two roots "+root1+" and "+root2);
        }

    }
}
