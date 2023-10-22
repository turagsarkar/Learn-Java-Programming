import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][]num = new int[2][3];
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the value for 2D array (array size 2*3)");
        for(int i=0 ; i<2;i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = input.nextInt();
            }
        }
        int sum= 0 ;
        for(int i=0 ; i<2;i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0 ; i<2;i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + num[i][j];
            }
        }
        System.out.println("Tota array sum is: "+sum);
    }
}
