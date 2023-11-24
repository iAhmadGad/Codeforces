
import java.util.Scanner;
 
/*
* A - George and Accommodation
*/
 
public class P467A
 {
   public static void main(String args[])
   { 
     Scanner scanner = new Scanner(System.in);
     byte n = scanner.nextByte(), counter = 0, p, q;
     
     for(byte i = 0; i < n; i++)
     {
       p = scanner.nextByte();
       q = scanner.nextByte();
       if( q - p >= 2) counter++;
     }
     
     System.out.println(counter);
   }
 }