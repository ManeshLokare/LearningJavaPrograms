package ex_200724;

import java.util.Scanner;

public class IntQue004 {
    public static void main(String[] args) {
        // find the character is vowel or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch =sc.next().charAt(0);
       //  char ch='a';
         if (ch== 'a' || ch== 'i'|| ch== 'e' || ch== 'o'||ch== 'u'){
             System.out.println("Its a vowel character");
         }
         else {
             System.out.println("its Consonent ");
         }



    }
}
