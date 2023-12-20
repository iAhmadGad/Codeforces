import java.util.Scanner;

/*
 * A - Anton and Danik
 */

public class P734A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		String wins = scanner.nextLine();
		int A = 0,  D = 0;
		
		for(int i = 0; i < wins.length(); i++)
		{
			if(wins.charAt(i) == 'A') A++;
			else if(wins.charAt(i) == 'D') D++;
		}
		
		if(A > D) System.out.println("Anton");
		else if(A < D) System.out.println("Danik");
		else System.out.println("Friendship");
	}
}
