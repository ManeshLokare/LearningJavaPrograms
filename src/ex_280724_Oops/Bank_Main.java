package ex_280724_Oops;

public class Bank_Main {
    public static void main(String[] args) {
        // create object to call method and variables....
         Bank_BluePrint bank1 = new Bank_BluePrint();
         Bank_BluePrint bank2 = new Bank_BluePrint();
         bank1.name = "SBI";
         bank2.name= "HDFC";
         bank1.balance =20000.0;
         bank2.balance =50000.0;
         bank1.account_type="Saving";
         bank2.account_type="Salary";

        System.out.println(bank1.name);
        System.out.println(bank1.balance);
        System.out.println(bank1.account_type);

        bank1.add_money();
        bank1.withdraw_money();
        bank1.check_balance();






    }
}
