import java.util.Scanner;

public class LargeElementIndex {
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
        int max = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                if (num[i+1][j+1]>max){
                    max=num[i+1][j+1];
                    rowIndex = i;
                    colIndex = j;
                }
            }
            System.out.println("Largest element: " + max);
            System.out.println("Smallest index of the largest element: [" + rowIndex + ", " + colIndex + "]");
        }
    }
}
