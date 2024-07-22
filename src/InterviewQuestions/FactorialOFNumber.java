package InterviewQuestions;

import java.util.Scanner;

public class FactorialOFNumber {
    public static void main(String[] args) {
    //   write program for find  Factorials of given number
        // n=5 -> Fact = 4*3*2*1 = 120
        // n=4 -> Fact = 3*2*1 = 6
        // n=3 -> Fact = 2*1 = 3
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();
         int fact=1;
     //    int num=5;
        for (int i = 1; i<=num ; i++)
        {
            fact= fact*i;
        }
        System.out.println("Factorial of "+num+" = "+fact);

    }
}
