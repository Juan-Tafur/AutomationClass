package ThirdSession;
/*Get the average for 4 students based on 4 test each one
    The average is per student
        */

import java.util.Scanner;

public class AverageTest {
    public static void  main (String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int students =4;
        int test = 4;

        for (int i=1; i<=students; i++)
        {
            double grades = 0.0;
            for(int j=1; j<=test; j++)
            {
                System.out.println("Enter the grade for the test # " + j + " for the student " + i);
                double grade = scanner.nextDouble();
                grades = grades + grade;
            }
            double average = grades/test;
            System.out.println("El promedio para el estudiante " + i + " is " + average);
        }
    }
}
