import java.util.Scanner;
import java.util.HashSet;

/*
 * A - Anton and Letters
 */

public class P443A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		HashSet<Character> set = new HashSet<Character>();
		for(short i = 1; i < input.length() - 1; i += 3) set.add(input.charAt(i));
		
		System.out.println(set.size());
	}
}
