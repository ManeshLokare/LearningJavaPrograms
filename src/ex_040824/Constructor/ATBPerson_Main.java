package ex_040824.Constructor;

import java.util.Scanner;

public class ATBPerson_Main {
    public static void main(String[] args) {

      /*   ATBPerson argument0 = new ATBPerson();
         ATBPerson argument1 = new ATBPerson("Manesh");
         ATBPerson argument2 = new ATBPerson("Manesh",25);
         ATBPerson argument3 = new ATBPerson("Manesh",25,7057933124l); */

         // take input from  the outside user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ATB Person Name");
        String name = sc.next();
        System.out.println("Enter the ATB Person Age");
        int age = sc.nextInt();
        System.out.println("Enter the ATB Person phone");
        long phone = sc.nextLong();
        // create object
        ATBPerson details = new ATBPerson(name,age,phone);
                details.person_details();

      /*   argument0.person_details();
        System.out.println(" ******************* ");
         argument1.person_details();
        System.out.println(" ******************* ");
        argument2.person_details();
        System.out.println(" ******************* ");
        argument3.person_details(); */

    }
}
