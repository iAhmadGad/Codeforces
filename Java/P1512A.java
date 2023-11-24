import java.util.Scanner;
import java.util.ArrayList;

/*
 * A - Spy Detected!
 */

public class P1512A 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		byte t = scanner.nextByte();
		
		for(byte i = 0; i < t; i++)
		{
			byte n = scanner.nextByte();
			ArrayList<Byte> list1 = new ArrayList<Byte>();
			ArrayList<Byte> list2 = new ArrayList<Byte>();
			byte a1 = scanner.nextByte();
			list1.add((byte) 1);
			
			for(byte j = 2; j <= n; j++)
			{
				if(scanner.nextByte() == a1) list1.add(j);
				else list2.add(j);
			}
			
			System.out.println((list1.size() == 1) ? list1.get(0) : list2.get(0));
		}
		
		scanner.close();
	}
}
