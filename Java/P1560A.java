import java.util.Scanner;

/*
 * A. Dislike of Threes
 */

public class P1560A
{
   public static short sequence[] = new short[1000];
   
   public static void makeSequence()
   {
       short index = 0;
       for(short i = 1; i <= 1666; i++)
       {
         char digits[] = String.valueOf(i).toCharArray();
         if( i % 3 != 0 && digits[digits.length - 1] != '3')
         {
             sequence[index] = i;
             index++;
         }
       }
   }
   
   public static void main(String args[])
   {
       makeSequence();
       
       Scanner scanner = new Scanner(System.in);
       byte t = scanner.nextByte();
       for(byte i = 0; i < t; i++) System.out.println(sequence[scanner.nextInt() - 1]);
       
       scanner.close();
       System.exit(0);
   }
}
