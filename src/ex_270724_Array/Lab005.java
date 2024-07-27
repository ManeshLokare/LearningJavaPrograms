package ex_270724_Array;

public class Lab005 {
    public static void main(String[] args) {
       final int [] num = new int[4];   // length size is final not values so can change values
        num[2]=40;
        System.out.println(num[3]); // 0
        System.out.println(num[2]); // 40

    }
}
