package InterviewQuestions;

import java.util.Scanner;

public class VowelCharMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char user_input=sc.next().charAt(0);
        switch (user_input){
            case 'a','A':
            case 'e','E':
            case 'i','I':
            case 'o','O':
            case 'u','U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }

    }
}
