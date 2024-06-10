import java.util.Scanner;

/*
* A - Ultra-Fast Mathematician
*/

public class P61A
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String line1 = scanner.next(), line2 = scanner.next();
    scanner.close();
    
    for(byte i = 0; i < line1.length(); i++)
    {
      if(line1.charAt(i) == line2.charAt(i)) System.out.print('0');
      else System.out.print('1');
    }
  }
}