package ex_040824_OOPs.Constructor;

public class BankAccount {

    String bank_name;
    String branch_code;
    String account_type;
    Double balance;

    BankAccount (){
      // default constructor...no argument
    }
    BankAccount (String bank_name,String branch_code,String account_type,double balance){
        // Parametrized constructor.....3 argument
        this.bank_name=bank_name;
        this.branch_code=branch_code;
        this.account_type=account_type;
        this.balance=balance;
    }

    void bank_information(){
        System.out.println("Bank Name -> "+bank_name);
        System.out.println("Branch Code -> "+branch_code);
        System.out.println("Account Type -> "+account_type);
        System.out.println("Balance -> "+balance);
    }

}
