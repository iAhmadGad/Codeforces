import java.util.Scanner;

/*
 * A - Elephant
 */

public class P617A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(),  output = input / 5;
		scanner.close();
		if(input % 5 != 0) output++;
		
		System.out.println(output);	
		}
}