package ex_110824_Abstraction.AbstractClass.Ex_004;

//Example of an abstract class that has constructor ,abstract and non-abstract methods
abstract class Bike{

    Bike()  // constructor
    {System.out.println("bike is created");}

    abstract void run();  // abstract method
    void changeGear()     // non abstract method
    {
        System.out.println("gear changed");
    }
}
//Creating a Child class which inherits Abstract class

class Honda extends Bike{
    void run(){
        System.out.println("running safely..");
    }


}

//Creating a Test class which calls abstract and non-abstract methods

class Test{
    public static void main(String args[]){
        Bike b = new Honda();
        b.run();
        b.changeGear();
    }
}
