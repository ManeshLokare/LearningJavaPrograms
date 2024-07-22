package InterviewQuestions;

import java.util.Scanner;

public class VowelCharMethod1 {
    public static void main(String[] args) {
        // find the character is vowel or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch =sc.next().charAt(0);
       //  char ch='a';
         if (ch== 'a' || ch== 'i'|| ch== 'e' || ch== 'o'||ch== 'u'){
             System.out.println("Its a vowel character");
         }
         else if (ch== 'A' || ch== 'I'|| ch== 'E' || ch== 'O'||ch== 'U'){
             System.out.println("Its a vowel character");
         }
         else {
             System.out.println("Its a Consonant");

         }



    }
}
