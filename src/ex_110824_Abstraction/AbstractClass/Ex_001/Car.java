package ex_110824_Abstraction.AbstractClass.Ex_001;

 class Car extends Engine {

    // engine ,gearbox,keys


    @Override
    void start() {
        System.out.println("Start Car");
    }

    @Override
    void stop() {
        System.out.println(" Stop car");
    }

    @Override
    void gearPart() {
        System.out.println("Gear box system");
    }

    @Override
    void openCar() {
        System.out.println(" Open car with key ");
    }
}
