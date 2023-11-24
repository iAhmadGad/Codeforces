import java.util.Scanner;

/*
 * A - Fox And Snake
 */

public class P510A 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte(), m = scanner.nextByte();
		scanner.close();
		
		for(byte i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				if(i % 4 == 0)
				{
					System.out.print("#");
					for(byte j = 1; j < m; j++) System.out.print(".");
				}
				else
				{
					for(byte j = 1; j < m; j++) System.out.print(".");
					System.out.print("#");
				}
			}
			else for(byte j = 0; j < m; j++) System.out.print("#");
			System.out.println();
		}
	}
}
