import java.util.Scanner;
 
public class P1A {
 
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		long n[] = new long[3];
		for(int i = 0; i < 3; i++)
		{
			n[i] = scanner.nextLong();
		}
		
		Long width = n[0] / n[2];
		if(n[0] % n[2] != 0) width++;
		Long height = n[1] / n[2];
		if(n[1] % n[2] != 0) height++;
		
		System.out.println(width * height);
	}
}
