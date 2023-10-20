import java.util.Scanner;

class Counts{
    public static void main(String[] args) {
        int[] occurrences = new int[100];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers between 1 and 100 (end with 0):");

        int num;
        do {
            num = scanner.nextInt();
            if (num >= 1 && num <= 100) {
                occurrences[num]++;
            } else if (num != 0) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            }
        } while (num != 0);
        System.out.println("Number\tOccurrences");
        for (int i = 1; i <= 100; i++) {
            if (occurrences[i] > 0) {
                System.out.println(i + "\t\t" + occurrences[i]);
            }
        }
    }
}

