import java.util.Scanner;

/*
 * A - Vasya the Hipster
 */

public class P581A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte red = scanner.nextByte(), blue = scanner.nextByte(), max = (red > blue) ? blue : red;
		scanner.close();
		
		System.out.println(max + " " + Math.abs(red - blue) / 2);
	}
}
