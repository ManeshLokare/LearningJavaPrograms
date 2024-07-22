package ex_210724;

public class ForLoopEx004 {
    public static void main(String[] args) {
        // Loop with condition

        for (int i = 0; i < 10; i++) {
            if (i==5) {
                System.out.println("Five");
            }
            else {
                System.out.println(i);  // 0 1 2 3 4 Five 6 7 8 9
            }
            }
    }
}
