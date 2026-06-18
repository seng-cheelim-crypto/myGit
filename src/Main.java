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

        // determine the age
        if(age <= 21)
            System.out.println("Welcome " + name + "is young");
        // determine if negative number
        else if (age < 0)
            System.out.println("negative number not allowed");
        else
            System.out.println("Welcome " + name + "is adult");


    }
}