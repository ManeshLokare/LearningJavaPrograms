package ex_210724_Loops;

public class ForLoopEx006 {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("A"); // 1 A 2 A 3 A 4 A 5 6 A 7 A 8 A 9 A

        }
    }
}
