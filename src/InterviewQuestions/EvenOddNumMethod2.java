package InterviewQuestions;

public class EvenOddNumMethod2 {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println("Even Num -> "+i); // 0 2 4 6 8 10
                continue;
            }
            System.out.println("Odd Num -> "+i);    // 1 3 5 7 9

        }
    }
}
