import java.util.Scanner;
import java.util.Arrays;

/*
* B - Vanya and Lanterns
*/

public class P492B
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    short n = scanner.nextShort();
    int l = scanner.nextInt(), a[] = new int[n];
    for(short i = 0; i < n; i++) a[i] = scanner.nextInt();
    scanner.close();
    Arrays.sort(a);
    double max = 0;
    for(short i = 1; i < n; i++) max = Math.max(max, a[i] - a[i - 1]);
    max = Math.max(max / 2, Math.max(a[0], l - a[n - 1]));
    System.out.println(max);
    System.exit(0);
  }
}
