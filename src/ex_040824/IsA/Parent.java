package ex_040824.IsA;

public class Parent {
    String name;
    int age;

    Parent () {}

    Parent(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void parent_detail()
    {
        System.out.println("Parent Name -> "+name);
        System.out.println("Parent Age -> "+age);
    }

}
