package ex_110824_Abstraction.Interface.MultipleInheritance;

public class Son implements Father ,Mother{


    @Override
    public void home() {
        System.out.println("only one home fuction ");
    }

    @Override
    public void money() {
        System.out.println("only one money fuction ");
    }
}
