import java.util.Scanner;
import java.util.Arrays;

/*
 * B - Good Kid
 */

public class P1873B
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		short t = scanner.nextShort();
		for(short i = 0; i < t; i++)
		{
			byte n = scanner.nextByte(), a[] = new byte[n];
			for(byte j = 0; j < n; j++) a[j] = scanner.nextByte();
			Arrays.sort(a);
			if(a[0] == 0) a[0] = 1;
			else a[0]++;
			System.out.println(getProduct(a));
		}
		scanner.close();
		System.exit(0);
	}
	
	public static int getProduct(byte[] array)
	{
		int result = 1;
		for(byte i = 0; i < array.length; i++) result *= array[i];
		return result;
	}
}
