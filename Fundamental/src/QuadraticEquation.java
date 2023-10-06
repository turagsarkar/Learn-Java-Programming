import java.util.Scanner;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void equation() {
        //QuadraticEquation: ax2 + bx + c = 0
        System.out.println("Enter your equation value a,b,c ");
        /*Do you see b2 − 4ac in the formula above? It is called the Discriminant, because it can "discriminate" between the possible types of answer:*/
             //1.when b2 − 4ac is positive, we get two Real solutions
             //2.when it is zero we get just ONE real solution (both answers are the same)
             //3.when it is negative we get a pair of Complex solutions
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double root1 , root2 , imaginary ;
        float discriminant = (b * b) - (4 * a * c);
        if(discriminant > 0)
        {
            root1 = (-b + sqrt(discriminant)) / (2*a);
            root2 = (-b - sqrt(discriminant)) / (2*a);

            System.out.println("Root 1:"+root1+" Root 2:"+root2);
        }
        else if(discriminant == 0)
        {
            root1 = root2 = -b / (2 * a);
            System.out.println("Root 1:"+root1+" Root 2:"+root2);
        }
        else
        {
            root1 = root2 = -b / (2 * a);
            imaginary = sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1:"+root1+" Imaginary value:"+imaginary+ " Root 2:"+root2+" Imaginary value:"+imaginary);
        }

    }
}
