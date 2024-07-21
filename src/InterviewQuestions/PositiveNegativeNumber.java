package InterviewQuestions;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        // write the program to find number is positive,negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num =sc.nextInt();

        if (num>0){
            System.out.println("+ve Number");
        }
        else if (num<0){
            System.out.println("-ve Number");
        }
        else{
            System.out.println("Zero");
        }



    }

}
