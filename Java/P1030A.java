import java.util.Scanner;

/*
* A - In Search of an Easy Problem
*/

public class P1030A
 {
   public static void main(String args[])
   { 
     Scanner scanner = new Scanner(System.in);
     boolean isEasy = true;
     byte n = scanner.nextByte();
     for(byte i = 0; i < n; i++)
     {
       if(scanner.nextByte() == 1)
       {
         isEasy = false;
         break;
       }
     }
     
     String output = isEasy ? "EASY" : "HARD";
     System.out.println(output);
   }
 }
