import java.util.Scanner;
import java.util.ArrayList;

public class P25A 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte();
		ArrayList<Byte> even = new ArrayList<Byte>();
		ArrayList<Byte> odd = new ArrayList<Byte>();
		for(byte i = 0; i < n; i++)
		{
			byte current = scanner.nextByte();
			if(current % 2 == 0) even.add((byte) (i + 1));
			else odd.add((byte) (i + 1));
		}
		scanner.close();
		if(even.size() == 1) System.out.println(even.get(0));
		else System.out.println(odd.get(0));
	}
}
