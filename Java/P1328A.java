import java.util.Scanner;
 
/*
* A - Divisibility Problem
*/
 
public class P1328A
 {
   public static void main(String args[])
   { 
     Scanner scanner = new Scanner(System.in);
     short t = scanner.nextShort();
     int a, b, output;
     
     for(short i = 0; i < t; i++)
     {
       a = scanner.nextInt();
       b = scanner.nextInt();
       output = (a % b == 0) ? 0 : b - (a % b);
       System.out.println(output);
     }
   }
 }