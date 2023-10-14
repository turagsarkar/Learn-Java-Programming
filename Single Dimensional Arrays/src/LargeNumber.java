import java.util.Scanner;

public class LargeNumber {
    public static void lnum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array size:");
        int n = input.nextInt();
        int[] number = new int[n];
        int i ;
        for ( i = 0 ; i<number.length;i++){
            number[i]=input.nextInt();
        }
        for (i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            System.out.println(" ");
        }
        int large = number[0];
        for(i = 1; i < number.length; i++){
            if(large<number[i]){
                large = number[i];
            }
        }
        System.out.println("Large Number is: "+large);
    }
}
