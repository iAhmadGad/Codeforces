import java.util.Scanner;

/*
 * A - Rigged!
 */

public class P1879A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		byte t = scanner.nextByte();
		for(byte i = 0; i < t; i++)
		{
			byte n = scanner.nextByte();
			int s[] = new int[n];
			byte e[] = new byte[n];
			for(byte j = 0; j < n; j++)
			{
				s[j] = scanner.nextInt();
				e[j] = scanner.nextByte();
			}
			System.out.println(getWeight(n, s, e));
		}
		scanner.close();
		System.exit(0);
	}
	
	public static int getWeight(byte atheletes, int strength[], byte endurance[])
	{
		int firstStrength = strength[0];
		byte firstEndurance = endurance[0];
		int weight = 1;
		for(byte i = 1; i < atheletes; i++)
		{
			if(firstStrength > strength[i] && firstEndurance <= endurance[i] && weight < strength[i] + 1) weight = strength[i] + 1;
			else if(firstStrength == strength[i] && firstEndurance > endurance[i] && weight < strength[i]) weight = strength[i];
			else if(firstStrength <= strength[i] && firstEndurance <= endurance[i]) return -1;
		}
		return weight;
	}
}
