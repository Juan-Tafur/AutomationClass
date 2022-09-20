package ThirdSession;

import java.util.Scanner;

public class ContainsLetter {

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String text = scanner.next();
        scanner.close();
        int amount = 0;

        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) == 'A' || text.charAt(i) == 'a')
            {
                amount++;
            }
        }
        System.out.println("the character is " + amount + " times in the text ");
    }
}
