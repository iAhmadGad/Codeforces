import java.util.Scanner;
 
public class P158A {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n,k, counter = 0;
		n = scanner.nextInt();
		k = scanner.nextInt();
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++) array[i] = scanner.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			if (array[i] == 0) break;
			if(array[i] >= array[k - 1]) counter++;
		}
		
		System.out.println(counter);
	}
}