package InterviewQuestions;

import java.util.Scanner;

public class LargestOf3Number {
    public static void main(String[] args) {
        //  write the program to find largest among three number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1 =sc.nextInt();
        System.out.println("Enter the Num2");
        int num2 =sc.nextInt();
        System.out.println("Enter the Num3");
        int num3 =sc.nextInt();
        // logic.....
      //  num1 >= num2 && num1 >=num3 -> num1
      //  num2 >= num1 && num2 >=num3 -> num2
      //  num3
        if (num1 >= num2 && num1 >=num3){
            System.out.println("Largest Number is "+num1);
        } else if (num2 >= num1 && num2 >=num3) {
            System.out.println("Largest Number is "+num2);
        }
        else {
            System.out.println("Largest Number is "+num3);

        }


    }
}
