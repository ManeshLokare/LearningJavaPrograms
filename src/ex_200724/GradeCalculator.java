package ex_200724;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // write program for grade calculator and displays the letter grade(A,B,C,D,or F)
        // based on following grading scale:
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score=sc.nextInt();
        char grade;

        if (score>=90 && score<=100){
           grade = 'A';
        } else if (score>=80 && score<=89) {
            grade = 'B';
        }else if (score>=70 && score<=79) {
            grade = 'C';
        }else if (score>=60 && score<=69) {
            grade = 'D';
        }else if (score<=0 || score>100) {
            System.out.println("LOL!!,are you God?");
            grade = 'O';
        }else{
            grade = 'F';
        }
        System.out.println("Student Grade: "+grade);

    }
}
