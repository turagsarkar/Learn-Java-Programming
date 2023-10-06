import java.util.Scanner;

public class ElectricityBill {
    public static void electric() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your total unit:");
        float unit = input.nextFloat();
        double amt , charge , total;
        if(unit <= 50)
        {
            amt = unit * 0.50;
        }
        else if(unit <= 150)
        {
            amt = 25 + ((unit-50) * 0.75);
        }
        else if(unit <= 250)
        {
            amt = 100 + ((unit-150) * 1.20);
        }
        else
        {
            amt = 220 + ((unit-250) * 1.50);
        }
        charge = (amt*20)/100;
        total=amt + charge;
        System.out.println("Your Total bill of electricity:"+total);
    }
}
