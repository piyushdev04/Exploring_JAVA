import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
        System.out.println("Please enter your name: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println( "Your name is: "+ name);
        System.out.println("Enter your marks: ");
        float marks = input.nextFloat();
        System.out.println("Your marks are:" + marks);
        System.out.println("you are in 10th class");
        boolean statement = input.nextBoolean();
        System.out.println("TRUE/FALSE: " + statement);
    }
}