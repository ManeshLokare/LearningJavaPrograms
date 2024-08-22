package ex_180824_ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        //  ArithmeticException-----------> any number divide by zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        try {
            System.out.println(100 / num);
        }
        catch (Exception e)
        {
            System.out.println("Please enter the valid data");
        }
    }

}
