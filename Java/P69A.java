import java.util.Scanner;

/*
 * A - Young Physicist
 */

public class P69A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte(), x = 0, y = 0, z = 0;
		boolean isEquilibrium = true;
		
		for(byte i = 0; i < n; i++)
		{
			    x += scanner.nextByte();
				y += scanner.nextByte();
				z += scanner.nextByte();
		}
		
		scanner.close();
		
		if(x != 0 || y != 0 || z != 0) isEquilibrium = false;
		
		String output = isEquilibrium ? "YES" : "NO";
		System.out.println(output);
	}
}
