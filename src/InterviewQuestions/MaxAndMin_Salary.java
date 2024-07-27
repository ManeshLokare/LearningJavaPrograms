package InterviewQuestions;

import java.util.Arrays;

public class MaxAndMin_Salary {
    public static void main(String[] args) {
        // find the maximum salary of employee using array
        int [] salary = {4,6,9,10,15,8,};
        int max_salary=1;
        int min_salary= salary[0];
        for (int i = 0; i < salary.length ; i++) {
            if (salary[i]> max_salary){
                max_salary = salary[i];
            }
            if( min_salary > salary [i]){
                min_salary=salary[i];
            }
        }
        System.out.println("maximum salary is "+ max_salary);
        System.out.println("minimum salary is "+ min_salary);

        // alternate way to find the max salary
        // sort array -> find the last one index then will get maximum
        Arrays.sort(salary);
        System.out.println(salary[salary.length-1]);
    }
}
