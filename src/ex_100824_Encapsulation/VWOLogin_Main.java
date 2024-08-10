package ex_100824_Encapsulation;

public class VWOLogin_Main {
    public static void main(String[] args) {
        VWOLogin data = new VWOLogin("Manesh","Manesh123");
        // get the data........
        data.getPassword();
        data.getUsername();
        System.out.println(data.getUsername());
        System.out.println(data.getPassword());
        // set the data.......
        data.setUsername("Ganesh");
        data.setPassword("Ganesh123");
        System.out.println(data.getUsername());
        System.out.println(data.getPassword());
    }
}
