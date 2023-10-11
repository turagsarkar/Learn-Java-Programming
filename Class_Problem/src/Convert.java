import java.util.Scanner;

public class Convert {
    public static void currency() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your conversion :");
        System.out.println("If you want convert USD to BDT Press 0");
        System.out.println("If you want convert BDT to USD Press 1");
        int x = input.nextInt();
        switch (x){
            case 0:
                System.out.println("Enter your US currency");
                float a = input.nextFloat();
                float result = a*100;
                System.out.println("Your BD currency:"+result);
                break;
            case 1:
                System.out.println("Enter your BD currency");
                float b= input.nextFloat();
                float r2 = b/100;
                System.out.println("Your BD currency:"+r2);

        }

    }
}
