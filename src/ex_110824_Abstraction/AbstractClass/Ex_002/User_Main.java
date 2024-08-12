package ex_110824_Abstraction.AbstractClass.Ex_002;

public class User_Main {
    public static void main(String[] args) {
    // concrete class ....> can create instance for abstract class (object)
        Shape s1 = new Circle();
        Shape s2 = new Reactangle();

              s1.draw();
              s2.draw();



    }
}
