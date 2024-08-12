package ex_110824_Static.Static_Variable;

public class Variable {

    // static variable-> declared in class block
    // static variable can use in same class or different class (className.memberName)
    static String name ="Manesh";
    static int age = 25;

    public static void main(String[] args) {
        System.out.println("Name -> "+name);
        System.out.println("Age -> "+age);

    }



}
