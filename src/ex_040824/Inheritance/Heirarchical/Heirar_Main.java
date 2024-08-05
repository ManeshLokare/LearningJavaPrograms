package ex_040824.Inheritance.Heirarchical;

public class Heirar_Main {
    public static void main(String[] args) {
        // child 1 can use father home
           Child1 ch1 = new Child1();
           ch1.child1_home();
           ch1.father_home();

           //  Child 2 can use father home.....

           Child2 ch2 = new Child2();
           ch2.child2_home();
           ch2.father_home();





    }
}
