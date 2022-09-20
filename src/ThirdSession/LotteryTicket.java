package ThirdSession;


import java.util.Random;

public class LotteryTicket {

    static int lenght = 6;
    public static void  main (String args[])
    {
      int[] ticket = generateNumbers();
      printTicket(ticket);

    }
    public static int[] generateNumbers()
    {
        int[] numbers = new int[lenght];

        Random random = new Random();

        for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = random.nextInt(69) + 1;
        }
        return numbers;
    }

    public static void printTicket(int[] ticket)
    {
        for(int i=0; i<ticket.length; i++)
        {
            System.out.print(ticket[i] + " | ");
        }
    }
}
