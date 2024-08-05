package ex_040824_OOPs.AccessModifier.Cops;

public class Police {
    // public -> Every Where can
    // private -> Same Class only
    // protected -> same class,same package subclass, same package non-sub class
    // default -> same class,same package subclass, same package non-sub class


   public String name;
   public int guns;

   public Police (String name, int guns)
    {
        this.name=name;
        this.guns=guns;
    }

   protected void shoot()
    {
        System.out.println("Yes You Can Shoot");
        System.out.println("Cop name -> "+ name);
        System.out.println("Cop how many guns -> "+guns);

    }


}
