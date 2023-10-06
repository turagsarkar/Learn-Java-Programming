import java.util.Scanner;

public class Grade {
    public static void number() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your total subject:");
        int a = input.nextInt();
        int i, per ;
        int mark = 0;
        System.out.println("Enter your subject mark:");
        for(i=0;i<a;i++){
            int b = input.nextInt();
            mark=mark+b;
        }
        System.out.println("Total mark:"+mark);
        per = mark/a;
        System.out.println("Your percentage mark:"+per);
        if(per >= 90)
        {
            System.out.println("Grade A");
        }
        else if(per >= 80)
        {
            System.out.println("Grade B");
        }
        else if(per >= 70)
        {
            System.out.println("Grade C");
        }
        else if(per >= 60)
        {
            System.out.println("Grade D");
        }
        else if(per >= 40)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}
