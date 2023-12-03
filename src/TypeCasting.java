import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int num = (int)(55.658);
//        System.out.println(num);

//        int a = 256;
//        byte b = (byte) (a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;
//
//        System.out.println(d);

          byte b = 42;
          char c = 'a';
          short s = 1024;
          int i = 50000;
          double d = 0.1234;
          float f = 5.67f;
          double result = (f * b) + (i / c) - (d * s);
          // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}