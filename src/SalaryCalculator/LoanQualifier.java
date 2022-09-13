package SalaryCalculator;

import java.util.Scanner;

public class LoanQualifier {

    /* approve the loan if the person makes more than 30000 and
    *has been their current job more than 2 years
    * inform which validation failed or congratulate if qualifies for a loan
     */

    public static void main (String args[]){

        int requiredSalary = 30000;
        int requiredYears = 2;
        Scanner scanner = new Scanner(System.in);

        //Get unknown values
        System.out.println("how much you make a year");
        int salary = scanner.nextInt();



        if (salary >= requiredSalary)
        {
            System.out.println("how manny years have you been in your current job?");
            int jobYears = scanner.nextInt();

            if (jobYears > requiredYears)
            {
                System.out.println("Congratulations! you apply for the loan ");
            }
            else
            {
                System.out.println("Sorry, the amount of years in your current job is not enough");
            }
        }
        else
        {
            System.out.println("Sorry, the amount of money you make per year is not enough");
        }



    }
}
