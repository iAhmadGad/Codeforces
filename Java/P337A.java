import java.util.Scanner;
import java.util.Arrays;

/*
 * A - Puzzles
 */

public class P337A 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte(), m = scanner.nextByte();
		short f[] = new short[m], diff;
		
		for(byte i = 0; i < m; i++) f[i] = scanner.nextShort();
		Arrays.sort(f);
		diff = (short) (f[m - 1] - f[0]);
		scanner.close();
		
		for(byte i = 0; i < m - n + 1; i++)
		{
			if(f[i + n - 1] - f[i] < diff) diff = (short) (f[i + n - 1] - f[i]);
		}
			
		System.out.println(Math.abs(diff));
	}
}
