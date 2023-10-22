import java.util.Random;
public class Randomnumber {
    public static void main(String[] args) {
        int[][] num = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
