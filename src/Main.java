import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello and welcome!");

        String name = sc.nextLine();

        // greet someone
        System.out.println("Welcome " + name);

        // get the age
        System.out.println("what is your age ");

        int age = sc.nextInt();

        if(age <= 21)
            System.out.println("Welcome " + name + "is young");
        else
            System.out.println("Welcome " + name + "is adult");


    }
}