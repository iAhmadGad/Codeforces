import java.util.Scanner;

/*
 * A - Police Recruits
 */

public class P427A {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), hired = 0, untreated = 0;
		
		for(int i = 0; i < n; i++)
		{
			byte current = scanner.nextByte();
			if(current == -1)
			{
				if(hired != 0) hired--;
				else untreated++;
			}
			else hired += current;
		}
		scanner.close();
		System.out.println(untreated);
	}
}
