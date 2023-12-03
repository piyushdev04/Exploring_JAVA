import java.util.Scanner;

public class Q_CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowwercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
