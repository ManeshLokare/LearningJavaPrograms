package ex_110824_Abstraction.Interface.Ex_001;

public class User_Main {
    public static void main(String[] args) {

        Engine e = new Oodie();
        e.startEngine();
        e.stopEngine();

        Oodie o = new Oodie();
        o.drive();
        Engine.speedEngine(); //static method access using class reference only(className.MethodName)


    }
}
