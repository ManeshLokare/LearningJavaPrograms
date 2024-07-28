package ex_280724_Oops;

import java.sql.SQLOutput;

public class Dog_Main {
    public static void main(String[] args) {
           // create object to call blueprint attribute and methods ->
         Dog_BluePrint dog1 = new Dog_BluePrint();
         dog1.name ="Chow Chow";
         dog1.age=5;
         dog1.color="Black";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        dog1.walk();
        dog1.talk();
        dog1.eat();
        dog1.sleep();







    }
}
