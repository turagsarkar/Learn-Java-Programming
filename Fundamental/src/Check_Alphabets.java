import java.util.Scanner;

public class Check_Alphabets {
    public static void check() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your character:");
        char ch = input.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("Vowel");
        }
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("Consonant");
        }
        else{
            System.out.println("NOT Alphabets");
        }

    }
}
