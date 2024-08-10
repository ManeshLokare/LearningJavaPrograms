package ex_100824_Encapsulation;

public class BankDetails_Main {
    public static void main(String[] args) {
         BankDetails data =new BankDetails("Ganesh",2000.00);
         // get the data...........
         data.getName();
         data.getAmount();
        System.out.println(data.getName());
        System.out.println(data.getAmount());
        // change/set the data...........
        data.setName("Manesh",true);
        data.setAmount(4000.00,false);
        System.out.println(data.getName());
        System.out.println(data.getAmount());

    }
}
