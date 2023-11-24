import java.util.Scanner;

/*
* A - Design Tutorial: Learn from Math
*/

public class P472A
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    
    for(int i = 2; i < 10; i++)
    {
    	if(!isPrime(i) && !isPrime(n - i))
    	{
    		System.out.println(i + " " + (n - i));
    		break;
    	}
    }
    System.exit(0);
  }
  
  public static boolean isPrime(int n)
  {
	  if(n == 0 || n == 1) return false;
	  for(int i = 2; i * i <= n; i++)
	  {
	      if(n % i == 0) return false;
	  }
	  return true;
  }
}