package ex_110824_Abstraction.Interface.Ex_002;

public class Methods_Main {

    public static void main(String[] args) {

    Impliment_Methods im = new Impliment_Methods();
    im.start();
    im.stop();
    im.default_Method1();
    im.default_Method2();

     // static method can call by using class reference (className.MethodName)
        Methods.static_Method1();
        Methods.static_Method2();
    }



}
