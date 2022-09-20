package ThirdSession;

import java.util.Scanner;

public class AddValues {

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        boolean sentinel = false;
        int result =0;

        do
        {
            System.out.println("enter a value: ");
            result = result + scanner.nextInt();

            System.out.println("do you want to stop");
            sentinel = scanner.nextBoolean();

        }
        while(!sentinel);

        System.out.println("the result of the operation is: " + result);
    }
}
