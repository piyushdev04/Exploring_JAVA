import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NUM1: ");
        int num1 = input.nextInt();
        System.out.print("NUM2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}