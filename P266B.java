import java.util.Scanner;

/*
 * B - Queue at the School
 */

public class P266B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte(), t = scanner.nextByte();
		String s = scanner.next();
		scanner.close();
		
		while(t != 0)
		{
			for(byte i = 1; i < n; i++)
			{
				if(s.charAt(i - 1) == 'B' && s.charAt(i) == 'G') 
				{
					s = s.substring(0, i - 1) + 'G' + 'B' + s.substring(i + 1);
					i++;
				}
			}
			t--;
		}
		System.out.println(s);
	}
}
