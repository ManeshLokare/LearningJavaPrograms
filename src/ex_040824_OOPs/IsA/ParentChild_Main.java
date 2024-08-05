package ex_040824_OOPs.IsA;

public class ParentChild_Main {
    public static void main(String[] args) {

        Child details = new Child("manesh",25,1997);
        Parent de = new Parent("khashaba",55);
        details.child_details();
        System.out.println("-------------------");
        de.parent_detail();

    }
}
