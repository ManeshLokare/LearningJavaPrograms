package ex_180824_ExceptionHandling;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        // unchecked exception---> exception which is checked at rumtime

       //  ArithmeticException-----------> any number divide by zero
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Number");
//        int num = sc.nextInt();
//        System.out.println(100/num);

      //  ArrayIndexOutOfBoundsException-------------> exceed the size of array
//        int a[] = {10,20,30,40};
//        a[6]=60;

       //  NumberFormatException-----------> any formating variable or number mismatched
      //  String s = "12345";
//        String s = "manesh";
//       int num = Integer.parseInt(s);
//        System.out.println(num);

      //  NullPointerException------------> if a null value in any variable(unknown value) not empty not zero
      //  String s = "Manesh";
        String s = null;
        System.out.println(s.length());
        System.out.println( s.toLowerCase());
        System.out.println( s.toUpperCase());



    }
}
