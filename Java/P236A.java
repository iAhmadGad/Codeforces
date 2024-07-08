import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class P236A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		scanner.close();
		
		Set<Character> characters = new HashSet<Character>();
		String output;
		
		for(byte i = 0; i < username.length(); i++) characters.add(username.charAt(i));
		
		if(characters.size() % 2 == 0) output = "CHAT WITH HER!\r\n"
				+ "";
		else output = "IGNORE HIM!\r\n"
				+ "";
		
		System.out.print(output);
	}
}
