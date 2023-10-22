import java.util.Scanner;

public class FindMaxIndex {
    public static void main(String[] args) {
        int[][]num = new int[3][3];
        Scanner input = new Scanner(System.in);
        for(int i=0 ; i< num.length;i++){
            for(int j=0; j<num[0].length;j++){
                num[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        int maxIndexR = -1;
        int maxIndexC=-1;
        int max = num[0][0];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if(max<num[i+1][j+1]){
                    max = num[i+1][j+1];
                    maxIndexR = i;
                    maxIndexC = j;
                }
            }
        }
        System.out.println("Largest element: " + max);
        System.out.println("Smallest index of the largest element: [" + maxIndexR + ", " + maxIndexC + "]");
    }
}
