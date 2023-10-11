import java.util.Scanner;

public class Time {
    public static void convert() {
        System.out.println("Enter the number of min:");
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        double time =60 * 24 * 365;
        long years = (long)( a / time);
        int days = (int) (a / 60 / 24) % 365;
        System.out.println(a + " minutes is approximately " + years + " years and " + days + " days");
    }
}
