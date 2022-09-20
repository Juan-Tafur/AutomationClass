package ThirdSession;

//*Execute the loop until value is zero or the total is higher to 1000

import java.util.Scanner;

public class GrossPayInputValidator {
    public static void main (String args[])
    {
        //initialize known values
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int total = 0;

        while (total <= 1000)
        {
            System.out.println("enter a value");
            value = scanner.nextInt();
            total = total + value;
        }
    }
}
