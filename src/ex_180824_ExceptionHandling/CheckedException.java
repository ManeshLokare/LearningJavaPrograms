package ex_180824_ExceptionHandling;

public class CheckedException  {
    public static void main(String[] args) throws InterruptedException{
        // checked exception---> exception which is checked at compile time

        System.out.println("Program start");
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program end");





    }

}
