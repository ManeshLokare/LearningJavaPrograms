package ex_110824_Static.Static_Block;

public class Block {
    // static block -> declared in class block
    // static block executed before main method loading process of class
    // static block do not have -> same name,access modifier,return type,formal arguments

    static int age= 25;
    static {
        System.out.println("static block executed before main method");
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println("Hello! How are you");
        System.out.println("Main End");
    }


}
