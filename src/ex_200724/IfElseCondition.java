package ex_200724;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2=sc.nextInt();
      //  System.out.println(Math.max(num1,num2));
      //  System.out.println(Math.min(num1,num2));
        if(num1>num2){
            System.out.println("1st number is maximum");
        } else if (num2>num1) {
            System.out.println("2nd number is maximum");

        } else{
            System.out.println("both numbers are equal");
        }



    }
}
