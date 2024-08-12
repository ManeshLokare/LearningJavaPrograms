package ex_110824_Abstraction.Interface.Ex_002;

public class Impliment_Methods implements Methods{

    // default method no need to implement its implement by default
    // only abstract method need to override/implement

    @Override
    public void start() {
        System.out.println("start method override/implement from methods class");
    }

    @Override
    public void stop() {
        System.out.println("Stop method override/implement from methods class");
    }

}
