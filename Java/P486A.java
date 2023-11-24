import java.util.Scanner;
 
/*
* A - Calculating Function
*/
 
public class P486A
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    
    System.out.println(f(n));
  }
  
  static long f(long n)
  {
    if (n % 2 == 0) return n / 2;
    else return - (n + 1) / 2;
  }
}