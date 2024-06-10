import java.util.Scanner;
import java.util.Arrays;
 
/*
 * A - Twins
 */
 
public class P160A 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte(), a[] = new byte[n], counter = 0, b1 = 0, b2 = 0;
		
		for(byte i = 0; i < n; i++)
		{
			byte current = scanner.nextByte();
			b1 += current;
			a[i] = current;
		}
		
		scanner.close();
		
		Arrays.sort(a);
		for(byte i = (byte) (n - 1); i >= 0; i--)
		{
			b2 += a[i];
			counter++;
			if(b2 > b1 / 2) break;
		}
		
		System.out.println(counter);
	}
}