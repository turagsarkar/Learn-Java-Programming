import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to fundamental course!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Calling problem:");
        int x = input.nextInt();
        System.out.println("Calling:"+x);
        if(x==0){
            Input.input_number();
        }
        else if (x==1){
            CheckNumber.condition();
        }
        else if (x==2) {
            Grade.number();
        }
        else if (x==3){
            Salary.salary();
        }
        else if (x==4){
            DivideNum.num();
        }
        else if (x==5){
            Year.check_year();
        }
        else if (x==6){
            Check_Alphabets.check();
        }
        else if (x==7) {
            QuadraticEquation.equation();
        }
        else if (x==8){
            ElectricityBill.electric();
        }
        else if(x==9){
            CheckTriangle.triangle();
        }
        else if (x==10){
            Calculator.calculator();
        }
        else
        {
            System.out.println("WRONG CALL");
        }
    }
}