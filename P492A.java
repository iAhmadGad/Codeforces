import java.util.Scanner;
import java.util.Arrays;

/*
* A - Vanya and Cubes
*/

public class P492A
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    System.out.println(getMaximumHeight(n));
    System.exit(0);
  }
  
  public static int getMaximumHeight(int cubes)
  {
    int i = 1, sub = 1, maximumHeight = 0;
    while(cubes - sub >= 0)
    {
      cubes -= sub;
      sub += ++i;
      maximumHeight++;
    }
    return maximumHeight;
  }
}
