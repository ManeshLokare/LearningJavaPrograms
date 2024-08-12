package ex_110824_Abstraction.Interface.Ex_002;

public interface Methods  {
  // in interface methods can create default abstract,public,static
    //
    void start();
    void stop();

    default void default_Method1(){
        System.out.println("Default Method1");
    }
    default void default_Method2(){
        System.out.println("Default Method2");
    }

    static void static_Method1(){
        System.out.println("Static Method1");
    }
    static void static_Method2(){
        System.out.println("Static Method2");
    }


}
