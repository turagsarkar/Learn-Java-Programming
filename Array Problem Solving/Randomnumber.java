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
        System.out.println("Random array");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                int i1 = (int) (Math.random()*num.length);
                int j1 = (int) (Math.random()*num[0].length);
                int temp = num[i][j];
                num[i][j] = num[i1][j1];
                num[i1][j1] = temp;
            }
        }
        System.out.println();
        System.out.println("Suffle array");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}
