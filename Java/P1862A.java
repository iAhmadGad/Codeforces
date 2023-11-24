import java.util.Scanner;

/*
* A - Gift Carpet
*/

public class P1862A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		char chars[] = {'v', 'i', 'k', 'a'};
		byte t = scanner.nextByte(), charIndex = 0;
		
		for(byte i = 0; i < t; i++)
		{
			byte n = scanner.nextByte(), m = scanner.nextByte();
			String nCarpets[] = new String[n];
			for(byte j = 0; j < n; j++) nCarpets[j]  = scanner.next();
			String mCarpets[] = new String[m];
			for(byte y = 0; y < m; y++)
			{
				if(charIndex == 4) break;
				mCarpets[y] = "";
				for(byte j = 0; j < n; j++)
				{
					mCarpets[y] += nCarpets[j].charAt(y);
				}
				if(mCarpets[y].contains(Character.toString(chars[charIndex]))) charIndex++;
			}
			if(charIndex == 4) System.out.println("YES");
			else System.out.println("NO");
			charIndex = 0;
		}
		scanner.close();
	}
}