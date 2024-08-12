package ex_110824_Abstraction.Interface.Ex_001;

public class Oodie implements Engine {

      void drive(){
          startEngine();
          stopEngine();
      }


    @Override
    public void startEngine() {
        System.out.println("Oody Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Oody Engine stopped");
    }
}
