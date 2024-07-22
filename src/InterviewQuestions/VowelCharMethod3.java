package InterviewQuestions;

import java.util.Scanner;

public class VowelCharMethod3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char user_input=sc.next().charAt(0);

        switch (user_input){
            case 'a','e','i','o','u','A','E','I','O','U':
                System.out.println("Character " +user_input+ " is Vowel");
                break;
            default:
                System.out.println("Character " +user_input+ " is not Vowel It's Consonant");
        }

    }
}
