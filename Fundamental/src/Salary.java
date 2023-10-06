import java.util.Scanner;

public class Salary {
    public static void salary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your basic salary:");
        float basic = input.nextFloat();
        double da , hra ,gross ;
        if(basic <= 10000)
        {
            da  = basic * 0.8;
            hra = basic * 0.2;
        }
        else if(basic <= 20000)
        {
            da  = basic * 0.9;
            hra = basic * 0.25;
        }
        else
        {
            da  = basic * 0.95;
            hra = basic * 0.3;
        }
        gross = basic + hra + da;
        System.out.println("This is your gross salary:"+gross);
    }
}
