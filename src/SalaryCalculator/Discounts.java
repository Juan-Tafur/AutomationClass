package SalaryCalculator;

import java.util.Scanner;

public class Discounts {
    /* Discounts based on the amount of products purchased
    - between 1 and 3 - 5%
    - between 4 and 6 - 10%
    - between 7 and 10 - 20%
    - more than 10 - 30%
     */

    public static void  main (String args[])
    {
        // initialize known values
        Scanner scanner = new Scanner(System.in);

        // Get unknown values
        System.out.println("How many products you bought?");
        int products = scanner.nextInt();

        if (products != 0) {

            if (products > 0 && products <= 3) {
                System.out.println("Congratulations  you have 5% discount");

            } else if (products >= 4 && products <= 6) {
                System.out.println("Congratulations  you have 10% discount");
            } else if (products >= 7 && products <= 10) {
                System.out.println("Congratulations  you have 20% discount");
            } else if (products > 10) {
                System.out.println("Congratulations  you have 30% discount");
            }
        }
        else
        {
            System.out.println("you didn't buy anything");
        }
    }
}
