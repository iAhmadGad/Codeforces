import java.util.Scanner;

/*
 * B - Drinks 
 */

public class P200B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte(); 
		short fractions = 0;
		for(byte i = 0; i < n; i++) fractions += scanner.nextByte();
		scanner.close();
		System.out.println((double) fractions / (double) n);
	}
}
