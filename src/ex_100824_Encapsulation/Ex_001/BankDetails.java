package ex_100824_Encapsulation.Ex_001;



public class BankDetails {

    public String name;
    public double amount;

    public BankDetails(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void setName(String name , boolean isAdmin) {
        if (isAdmin) {
            this.name = name;
        } else {
            System.out.println(" Only Can Admin Change");
        }
    }

    public void setAmount(double amount, boolean isAdmin) {
        if (isAdmin) {
            this.amount = amount;
        } else {
            System.out.println(" Only Can Admin Change");
        }
    }
}