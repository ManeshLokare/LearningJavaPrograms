package ex_040824_OOPs.HasA;

public class Sim {
    String brand;
    String type;

    public Sim() {}

    Sim(String brand,String type)
    {
        this.brand=brand;
        this.type=type;

    }

    public void sim_details()
    {
        System.out.println("Sim Card Brand Name -> "+brand);
        System.out.println("Sim Card Type -> "+type);
    }

}
