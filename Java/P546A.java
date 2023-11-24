import java.util.Scanner;

/*
 * A - Soldier and Bananas
 */

public class P546A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt(), w = scanner.nextInt();
	    int n = scanner.nextInt();
	    
	    if(price(k, n) - w > 0) System.out.println(price(k, n) - w);
	    else System.out.println(0);
	}
	
	static int price(int cost, int desire)
	{
		if(desire == 1)
		{
			return cost;
		}
		
		return cost * desire + price(cost, desire - 1);
	}
}
