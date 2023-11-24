import java.util.Scanner;

/*
 * A - Beautiful Year
 */

public class P271A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short y = scanner.nextShort();
		scanner.close();
		boolean beautiful = false;
		while(!beautiful) 
		{
			y++;
			String year = String.valueOf(y);
			char a = year.charAt(0), b = year.charAt(1), c = year.charAt(2), d = year.charAt(3);
			if(a != b && a != c && a != d && b != c && b != d && c != d) beautiful = true;
		}
		
		System.out.println(y);
	}
}
