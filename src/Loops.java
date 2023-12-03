import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
           Syntax of for loops:

           for (initialization; condition; increment/decrement){
                  // body
           }
        */

        // Q: Print number from 1 to 5

//        for (int num = 2; num <= 50; num += 2){
//            System.out.println(num);
//        }

        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//        for (int num = 1; num <= n; num++) {
//              System.out.println(num + " ");
//            System.out.println("RAM RAM BHAI SAREYANE");
//        }

        // while loops
        /*
             Syntax:
             while (condition){
                  //body
             }
        */

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

        // do while
        /*

              do{
                    //body
              } while (condition);

        */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}