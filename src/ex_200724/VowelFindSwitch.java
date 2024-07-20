package ex_200724;

import java.util.Scanner;

public class VowelFindSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char user_input=sc.next().charAt(0);

        switch (user_input){
            case 'a','e','i','o','u':
                System.out.println("Character " +user_input+ " is Vowel");
                break;
            default:
                System.out.println("Character " +user_input+ " is not Vowel It's Consonant");
        }



    }
}
