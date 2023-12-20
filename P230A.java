import java.util.Scanner;
import java.util.ArrayList;

/*
 * A - Dragons
 */

public class P230A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextShort();
		short n = scanner.nextShort();
		ArrayList<Short> x = new ArrayList<Short>(), y = new ArrayList<Short>();
		boolean canMove = true;

		for(short i = 0; i < n; i++)
		{
			x.add(scanner.nextShort());
			y.add(scanner.nextShort());
		}
		scanner.close();
		
		for(short i = 0; i < x.size(); i++)
		{
			if(s > x.get(i))
			{
				s += y.get(i);
				x.remove(i);
				y.remove(i);
				i = -1;
			}
			else if(i == x.size() - 1)
			{
				canMove = false;
				break;
			}
		}
		
		String output = canMove ? "YES" : "NO";
		System.out.println(output);
	}
}
