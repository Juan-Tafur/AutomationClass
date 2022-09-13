package SalaryCalculator;

import java.util.Scanner;

public class SalaryCalculator {
    /*Excercise1
     *get a sales person salary based on the amount of sales
     *if sales are more than 10 the bonus is %250
     * Base salary is 1000
     **/
    static int salary = 1000;
    static int bonus = 250;

    public static void main(String args[])
    {

        System.out.println("how many sales did you make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > 10)
        {
            salary = salary + bonus;
        }
        System.out.println("This month payment is " + salary);
    }
}