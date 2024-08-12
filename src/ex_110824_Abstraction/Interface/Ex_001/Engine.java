package ex_110824_Abstraction.Interface.Ex_001;

public interface Engine {

   // incomplete methods ...by default abstract,public,static
    // complete (concrete) method not possible in interface
    // can not create instance (obj) for abstract and interface class
    void startEngine();
    void stopEngine();

    static void speedEngine(){     // static method

        System.out.println("Oody Speed is more");
    }


}
