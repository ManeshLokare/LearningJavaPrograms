package InterviewQuestions;

import java.util.Scanner;

public class StudentAvg_Marks {
    public static void main(String[] args) {
        // display the student average marks of 5 subject
        // marks given by user input
        Scanner sc= new Scanner(System.in);
        float [] marks =new float[5];
     /*
        System.out.println("Enter 1st Subject Marks");
         marks [0] = sc.nextFloat();
        System.out.println("Enter 2nd Subject Marks");
        marks [1] = sc.nextFloat();
        System.out.println("Enter 3rd Subject Marks");
        marks [2] = sc.nextFloat();
        System.out.println("Enter 4th Subject Marks");
        marks [3] = sc.nextFloat();
        System.out.println("Enter 5th Subject Marks");
        marks [4] = sc.nextFloat();
      */
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the Subject "+ (i+1)+" Marks");
        //    System.out.println("Enter the Subject");
            marks [i] =sc.nextFloat();
        }

        float avg_marks =  (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Average Marks Is -> "+avg_marks);


    }
}
