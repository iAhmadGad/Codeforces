import java.util.Scanner;
import java.util.Arrays;

public class P405A {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte(), a[] = new byte[n];
		
		for(byte i = 0; i < n; i++) a[i] = scanner.nextByte();
		
		Arrays.sort(a);
		
		for(byte i : a) System.out.print(i + " ");
		
		scanner.close();
	}
}
