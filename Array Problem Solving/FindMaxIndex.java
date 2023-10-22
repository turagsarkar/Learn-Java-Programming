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
        int maxSum = Integer.MIN_VALUE;
        int rowInd = 0 ;
        for (int i = 0; i < 3; i++) {
            int sum = 0 ;
            for (int j = 0; j < 3; j++) {
                sum += num[i][j];
            }
            if (sum>maxSum){
                maxSum=sum;
                rowInd = i ;
            }
        }
        System.out.println("Row number "+rowInd+" has total sum "+maxSum);
    }
}
