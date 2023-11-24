import java.util.Scanner;
 
/*
 * B - Taxi
 */
 
public class P158B 
{
 
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, finalTaxis = 0;
		for(int i = 0; i < n; i++)
		{
			byte current = scanner.nextByte();
			if(current == 1) counter1++;
			else if(current == 2) counter2++;
			else if(current == 3) counter3++;
			else counter4++;
		}
		scanner.close();
		
		finalTaxis += counter4;
		//combine 1s & 3s
		while(counter1 != 0 && counter3 != 0)
		{
			counter1--;
			counter3--;
			finalTaxis++;
		}
		finalTaxis += counter3;
		//combine 2's
		if(counter2 != 0)
		{
			finalTaxis += counter2 / 2;
			counter2 %= 2;
		}
		while(counter1 != 0 && counter2 != 0)
		{
			counter1 -= 2;
			counter2--;
			finalTaxis++;
		}
		finalTaxis += counter2;
		//combine 1s
		finalTaxis += counter1 / 4;
		counter1 %= 4;
		if(counter1 == 1 || counter1 == 3 || (counter1 == 2 && counter2 == 0)) finalTaxis++;
		
		System.out.println(finalTaxis);
	}
}