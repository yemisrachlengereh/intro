
import java.util.Scanner;

class Intro{
    public static void main(String args[])

    {

        String name;
        String experiance;
        String major;
        String Interest;
        String Origin;
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name?");
        name=input.nextLine();
        System.out.println("What is the your level of experiance with Java?");
        experiance=input.nextLine();
        System.out.println("What is/was your major?");
        major= input.nextLine();
        System.out.println("Please tell me something interesting about you?");
        Interest=input.nextLine();
        System.out.println("Please tell me something where are you from?");
        Origin=input.nextLine();

    }
}