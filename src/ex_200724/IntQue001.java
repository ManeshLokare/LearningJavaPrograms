package ex_200724;

import java.util.Scanner;

public class IntQue001 {
    public static void main(String[] args) {
        // write program name,age,salary

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your age");
        int age= sc.nextInt();
        System.out.println("Enter your salary");
        double salary=sc.nextDouble();

        System.out.println("Your Name is "+ name);
        System.out.println("Your Age is "+ age);
        System.out.println("Your Salary is "+ salary);

        sc.close();
    }
}
