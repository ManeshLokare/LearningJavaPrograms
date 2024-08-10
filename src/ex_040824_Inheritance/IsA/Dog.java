package ex_040824_Inheritance.IsA;

public class Dog extends Animal{
    String color;

     Dog(String name,String color)
    {
        this.name=name;
        this.color=color;
    }

    public void animalColor()
    {
        System.out.println("Animal color");
    }
}
