package ex_040824_Inheritance.IsA;

public class Child extends Parent{

    int birthdate;

    Child ( String name,int age,int birthdate)
    {
        super();
        this.name=name;
        this.age=age;
        this.birthdate=birthdate;
    }
    public void child_details()
    {
        System.out.println("Child Name ->"+ name);
        System.out.println("Child Age ->" + age);
        System.out.println("Child Birth Date ->" + birthdate);

    }

}
