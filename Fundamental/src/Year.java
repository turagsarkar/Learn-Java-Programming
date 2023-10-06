import java.util.Scanner;

public class Year {
    public static void check_year() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = input.nextInt();
        if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0))
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("NOT LEAP YEAR");
        }

    }
}
