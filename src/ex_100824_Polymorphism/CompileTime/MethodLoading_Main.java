package ex_100824_Polymorphism.CompileTime;

public class MethodLoading_Main {
    public static void main(String[] args) {

        MethodLoading addition = new MethodLoading();
       int result1 = addition.add(10,20);
       double result2 = addition.add(2.5,2.5);

        System.out.println("Add Result1-> "+result1);
        System.out.println("Add Result2-> "+result2);




    }
}
