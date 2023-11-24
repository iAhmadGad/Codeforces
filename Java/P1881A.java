import java.util.Scanner;

/*
 * A - Don't Try to Count
 */

public class P1881A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i = 0; i < t; i++)
		{
			byte n = scanner.nextByte(), m = scanner.nextByte();
			scanner.nextLine();
			String x = scanner.nextLine(), s = scanner.nextLine();
			System.out.println(getMinimum(x, s, n, m));
		}
		scanner.close();
		System.exit(0);
	}
	
	public static int getMinimum(String sup, String sub, byte supLength, byte subLength)
	{
		int min = 0;
		if(sup.contains(sub)) return 0;
		else if(sup.length() > sub.length())
		{
				sup += sup;
				min++;
		}
		else
		{
			while(sup.length() < sub.length())
			{
				sup += sup;
				min++;
			}
		}
		if(sup.contains(sub)) return min;
		else if((sup + sup).contains(sub)) return min + 1;
		return -1;
	}
}
