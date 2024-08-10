package ex_100824_Polymorphism.CompileTime;

public class MethodLoading {

    // Method Loading -> same name but different arguments
   // Compile time polymorphism

    int add (int a, int b)
    {
        return a+b;
    }
    double add (double a, double b)
    {
        return  a+b ;
    }

}
