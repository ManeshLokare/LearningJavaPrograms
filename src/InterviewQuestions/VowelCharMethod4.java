package InterviewQuestions;

import java.util.Scanner;

public class VowelCharMethod4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        String user_input = sc.nextLine();
        switch (user_input.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }
    }
}
