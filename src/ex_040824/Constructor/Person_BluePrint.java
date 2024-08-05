package ex_040824.Constructor;

public class Person_BluePrint {
    // constructor---> same name as class name
    // constructor do not have any return type
    /* types -> 1. Default ex_040824.Constructor (No argument ex_040824.Constructor)
            2.Parametrized constructor (argument constructor) */
    String name;
    int age;

    // Default ex_040824.Constructor
    Person_BluePrint() {
        System.out.println("Person Name -> "+name);
        System.out.println("Person Age -> "+age);
    }

    // Parametrized constructor
    Person_BluePrint (String name, int age){
        this.name= name;
        this.age= age;
    }
    void talk(){
        System.out.println("Person Can Talk");
        System.out.println("Person Name -> "+name);
        System.out.println("Person Age -> "+age);
    }

}
