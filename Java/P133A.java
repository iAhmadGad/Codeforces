import java.util.Scanner;
 
/*
* A - HQ9+
*/
 
public class P133A
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    scanner.close();
    boolean isValid = false;
    
    for(byte i = 0; i < input.length(); i++)
    {
      char c = input.charAt(i);
      if(c == 'H' || c == 'Q' || c == '9')
      {
        isValid = true;
        break;
      }
    }
    
    String output = isValid ? "YES" : "NO";
    System.out.println(output);
  }
}