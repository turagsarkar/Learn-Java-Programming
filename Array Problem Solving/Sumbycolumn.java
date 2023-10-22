import java.util.Scanner;

public class Sumbycolumn {
    public static void main(String[] args) {
        int[][] num = new int[2][3];
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the value for 2D array (array size 2*3)");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        int row = num.length;
        int col = num[0].length;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum = sum + num[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column: " + sum);
        }
        int sumR = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sumR += num[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " Row: " + sumR);
        }
    }
}
