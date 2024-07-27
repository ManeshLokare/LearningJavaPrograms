package ex_200724_ifElseLoops;

import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {
        // take input from user....by using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input =sc.nextInt();
        System.out.println(user_input);
        if (user_input%2==0)
        {
            System.out.println("Even Number");
        }
        else {
            System.out.println(" Odd Number");
        }


    }
}
