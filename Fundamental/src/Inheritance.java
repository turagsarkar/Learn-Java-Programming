import java.util.Scanner;

class Employee{
    int salary;
    void show() {
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        System.out.println(salary);
    }
}
class People extends Employee {
    void pearson(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Your Name: "+name);
    }
}

class Inheritance {
    public static void main(String[] args) {
        People obj = new People();
        obj.pearson();
        obj.show();

    }
}
