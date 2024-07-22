package InterviewQuestions;

public class EvenOddNumMethod1 {
    public static void main(String[] args) {
        // print the even and odd number of between 0 and 50
        for (int i = 0; i <= 10; i++) {
            if(i%2==0)   //               (i%2!=0 -> Odd Number)
            {
                System.out.println("Even Number is "+i);
            } else {
                System.out.println("Odd Number is "+i);
            }
        }

    }
}
