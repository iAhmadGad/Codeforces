import java.util.Scanner;
import java.util.ArrayList;
 
/*
* A - Kefa and First Steps
*/
 
public class P520A
{
  public static void main(String args[])
  {
    ArrayList<Character> upper = new ArrayList<Character>();
    ArrayList<Character> lower = new ArrayList<Character>();
    
    for(byte i = 65; i < 91; i++) upper.add((char) i);
    for(byte i = 97; i < 123; i++) lower.add((char) i);
    
    Scanner scanner = new Scanner(System.in);
    
    byte n = scanner.nextByte(), counter = 0;
    String text = scanner.next();
    scanner.close();
    
    if(n < 26) n = 0;
    
    for(byte i = 0; i < n; i++)
    {
      for(byte j = 0; j < upper.size(); j++)
      {
        if(text.charAt(i) == upper.get(j) || text.charAt(i) == lower.get(j))
        {
          counter++;
          upper.remove(j);
          lower.remove(j);
          j--;
          break;
        }
      }
    }
    
    text = (counter == 26) ? "YES" : "NO";
    
    System.out.println(text);
  }
}