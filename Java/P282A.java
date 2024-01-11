import java.util.Scanner;
 
public class P282A {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short n  = scanner.nextShort(), x = 0;
		
		for(short i = 0; i <= n; i++)
		{
			String statement = scanner.nextLine();
			if(statement.compareTo("X++") == 0 || statement.compareTo("++X") == 0) x++;
			else if(statement.compareTo("X--") == 0 || statement.compareTo("--X") == 0) x--;
		}
		
		System.out.println(x);
	}
}