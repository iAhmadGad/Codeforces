import java.util.Scanner;

public class P344A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), counter = 0;
		String current = " ", next;
		
		for(int i = 0; i < n; i++)
		{
			next = scanner.next();
			if(current.compareTo(next) != 0) counter++;
			current = next;
		}
		
		scanner.close();
		System.out.println(counter);
	}
}