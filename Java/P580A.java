import java.util.Scanner;
import java.util.Arrays;

/*
* A - Kefa and First Steps
*/

public class P580A
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(), a[] = new int[n], counter[] = new int[n], counterIndex = 0;
    
    for(int i = 0; i < n; i++) a[i] = scanner.nextInt();
    
    for(int i = 0; i < n - 1; i++)
    {
      if(a[i] <= a[i + 1]) counter[counterIndex]++;
      else 
      {
          counterIndex++;
          counter[counterIndex] = 0;
      }
    }
    
    Arrays.sort(counter);
    System.out.println(counter[counter.length - 1] + 1);
  }
}