import java.util.Scanner;
import java.util.Arrays;

/*
* A - Holiday Of Equality
*/

public class P758A
{
    public static void main(String args[])
    {
       Scanner scanner = new Scanner(System.in);
       byte n = scanner.nextByte();
       int a[] = new int[n];
       
       for(byte i = 0; i < n; i++) a[i] = scanner.nextInt();
       scanner.close();
       
       Arrays.sort(a);
       
       int s = 0;
       for(byte i = 0; i < n; i++) s += a[n - 1] - a[i];
       System.out.println(s);
       System.exit(0);
    }
}
