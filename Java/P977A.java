import java.util.Scanner;

/*
 * A - Wrong Subtraction
 */

public class P977A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		byte k = scanner.nextByte();
		
		System.out.println(sub(n, k));
	}
	
	static int sub(int n, byte k)
	{
		if(k == 0) return n;
		else if(n % 10 == 0) return sub(n / 10, (byte) (k - 1));
		else return sub(n - 1, (byte) (k - 1));
	}
}
