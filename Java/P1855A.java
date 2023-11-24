import java.util.Scanner;

public class P1855A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short t = scanner.nextShort();
		int n, p[], counter1 = 0, counter2 = 0;
		
		for(short i = 0; i < t; i++)
		{
			 n = scanner.nextInt();
			 p = new int[n];
			 for(int j = 0; j < n; j++)
			 {
				 p[j] = scanner.nextInt();
			 }
			 
			 for(int j = 0; j < n; j++)
			 {
				 if(p[j] == j + 1) 
				 {
					 counter1++;
				 }
			 }
			 
			 for(int y = 0; y < counter1; y++)
			 {
				 if(counter1 > 1)
				 {
					 counter1 -= 2;
					 counter2++;
				 }
				 else if(counter1 == 1)
				 {
					 counter1--;
					 counter2++;
				 }
				 
				 y--;
			 }
			 
			 System.out.println(counter2);
			 counter2 = 0;
		}
		
		scanner.close();
	}
}
