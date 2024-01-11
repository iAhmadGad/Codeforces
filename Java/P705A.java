import java.util.Scanner;
 
/*
* A - Hulk
*/
 
 public class P705A
 {
   public static void main(String args[])
   { 
    Scanner scanner = new Scanner(System.in);
    byte n = scanner.nextByte();
    System.out.print("I hate ");
    n++;
    for(byte i = 2; i < n; i++)
    {
      if(i % 2 == 0) System.out.print("that I love ");
      else System.out.print("that I hate ");
    }
    System.out.print("it");
   }
 }