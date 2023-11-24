import java.util.Scanner;

/*
*
*/

public class P318A
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    long k = scanner.nextLong(), n = scanner.nextLong(), output = 0;
    
    if(k % 2 == 0)
    {
      if(n <= k / 2)
      {
        output += 2 * (n - 1) + 1;
      }
      else
      {
        n -= k / 2;
        output += 2 * n;
      }
    }
    else
    {
      if(n <= k / 2 + 1)
      {
        output += 2 * (n - 1) + 1;
      }
      else
      {
        n -= k / 2 + 1;
        output += 2 * n;
      }
    }
    
    System.out.println(output);
  }
}