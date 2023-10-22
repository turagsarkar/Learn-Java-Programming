import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] answers = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String[][] ans = new String[10][10];
        System.out.println("Fill in the Ten student's answers to 10 questions");
        for (int i = 0; i < ans.length; i++) {
            int count = 0;
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = scan.next();
                if (ans[i][j].equalsIgnoreCase(answers[j])) {
                    count++;

                }
            }
            System.out.println("Student's " + i + " correct answers are " + count);
        }

    }
}

