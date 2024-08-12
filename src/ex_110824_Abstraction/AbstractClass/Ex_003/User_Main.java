package ex_110824_Abstraction.AbstractClass.Ex_003;

public class User_Main {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.getRateOfInterest();
        b2.getRateOfInterest();
        System.out.println("SBI Bank Rate Of Interest -> "+b1.getRateOfInterest()+" % ");
        System.out.println("HDFC Bank Rate Of Interest -> "+b2.getRateOfInterest()+" % ");


    }

}
