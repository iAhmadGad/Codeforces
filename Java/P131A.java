import java.util.Scanner;

/*
 * A - cAPS lOCK
 */

public class P131A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		boolean caps = true;
		
		for(byte i = 1; i < s.length(); i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				caps = false;
				break;
			}
		}
		
		if(caps)
		{
			if(Character.isLowerCase(s.charAt(0))) System.out.print(Character.toUpperCase(s.charAt(0)));
			else System.out.print(Character.toLowerCase(s.charAt(0)));
			for(byte i = 1; i < s.length(); i++) System.out.print(Character.toLowerCase(s.charAt(i)));
		}
		
		else System.out.println(s);
	}
}
