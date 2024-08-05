package ex_040824_OOPs.Constructor;

public class ATBPerson {
       String name;
       int age;
       long phone;

       ATBPerson(){
           System.out.println("Default Constructor");
       }
       ATBPerson (String name){    // Parametrized Constructor with 1 Argument
            this.name=name;
       }
    ATBPerson (String name,int age){   // Parametrized Constructor with 2 Argument
        this.name=name;
        this.age=age;
    }
    ATBPerson (String name,int age,long phone){  // Parametrized Constructor with 3 Argument
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    public void person_details(){
        System.out.println("ATBPerson Name -> "+name);
        System.out.println("ATBPerson Age -> "+age);
        System.out.println("ATBPerson Phone -> "+phone);
    }


}
