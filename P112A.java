import java.util.Scanner;
 
public class P112A {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String letter1 = scanner.nextLine().toLowerCase(), letter2 = scanner.nextLine().toLowerCase();
		byte output = 0;
		
		if(letter1.compareTo(letter2) == 0) output = 0;
		if(letter1.compareTo(letter2) < 0) output = -1;
		if(letter1.compareTo(letter2) > 0) output = 1;
		
		System.out.println(output);
	}
}