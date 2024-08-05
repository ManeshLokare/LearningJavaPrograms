package ex_040824.HasA;

public class Mobile {

    String brand;
    String name;

    Mobile(){}

    Mobile(String brand,String name)
    {
        this.brand=brand;
        this.name=name;
    }

   public void mobile_details()
    {
        System.out.println("Mobile Brand Name -> "+brand);
        System.out.println("Mobile Name -> "+name);
    }

}
