import java.util.Scanner;

class Animal{
    String name;
    Scanner input = new Scanner(System.in);
    void eat(){
        System.out.println("I Can eat");
    }
}
class Dog extends Animal{
    void display(){
        System.out.println("My name is: "+name);
    }
}




public class Animalproblem {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name = "labrador";
        labrador.display();
        labrador.eat();

    }
}
