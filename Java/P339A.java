import java.util.Arrays;
import java.util.Scanner;

/*
 * A - Helpful Maths
 */

public class P339A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		String inputSplit[] = input.split("\\+");
		int summands[] = new int[inputSplit.length];
		
		for(byte i = 0; i < inputSplit.length; i++) summands[i] = Integer.parseInt(inputSplit[i]);
		Arrays.sort(summands);
		
		System.out.print(summands[0]);
		for(byte i = 1; i < summands.length; i++) System.out.print("+" + summands[i]);
	}
}
