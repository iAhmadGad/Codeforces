import java.util.Scanner;
import java.util.ArrayList;

/*
 * A - Sereja and Dima
 */

public class P381A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		short n = scanner.nextShort();
		ArrayList<Short> cards = new ArrayList<Short>();
		
		for(short i = 0; i < n; i++) cards.add(scanner.nextShort());
		
		scanner.close();
		
		int serejaPoints = 0, dimaPoints = 0;
		for(short i = 0; i < n; i++)
		{
			if(i == 0 || i % 2 == 0)
			{
				if(cards.get(cards.size() - 1) > cards.get(0))
				{
					serejaPoints += cards.get(cards.size() - 1);
					cards.remove(cards.size() - 1);
				}
				else
				{
					serejaPoints += cards.get(0);
					cards.remove(0);
				}
			}
			else
			{
				if(cards.get(cards.size() - 1) > cards.get(0))
				{
					dimaPoints += cards.get(cards.size() - 1);
					cards.remove(cards.size() - 1);
				}
				else
				{
					dimaPoints += cards.get(0);
					cards.remove(0);
				}
			}
		}
		
		System.out.println(serejaPoints + " " + dimaPoints);
		System.exit(0);
	}
}
