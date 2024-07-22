package ex_200724;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SwitchEx002 {
    public static void main(String[] args) {
        //  find the coding course name is available or not  given by user in string format
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Course Name");
        String course_name= sc.nextLine();

       switch (course_name.toLowerCase())
       {
               case "java":
               System.out.println("JAVA Course Found");
               break;
               case "python":
               System.out.println("PYTHON Course Found");
               break;
               case "sql":
               System.out.println("SQL Course Found");
               break;
           default:
               System.out.println("Course Not Found");


       }


    }
}
