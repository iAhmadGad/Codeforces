import java.util.Scanner;

/*
 * A - Beautiful Matrix
 */
 
public class P263A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte x = 0, y = 0;
		
		for(byte i = 0; i < 5; i++)
		{
			String row = scanner.nextLine();
			for(byte j = 0; j < 9; j += 2)
			{
				if(row.charAt(j) == '1') 
				{
					x = (byte) (i + 1);
					y = (byte) (j / 2 + 1);
				}
			}
		}
		
		System.out.println((byte) (Math.abs(x - 3) + Math.abs(y - 3)));
	}
}
