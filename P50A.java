import java.util.Scanner;
 
public class P50A {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		byte m = scanner.nextByte(), n = scanner.nextByte();
		
		System.out.println(m * n / 2);
	}
}