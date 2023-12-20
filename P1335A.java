import java.util.Scanner;

/*
 * A - Candies and Two Sisters
 */

public class P1335A 
{
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
    	short t = scanner.nextShort();
    	
    	for(short i = 0; i < t; i++)
    	{
    		int n = scanner.nextInt();
    		System.out.println(distribute(n));
    	}
    	
    	scanner.close();
    }

    public static int distribute(int n)
    {
    	if(n == 1 || n == 2) return 0;
    	else if(n % 2 == 0) return n / 2 - 1;
    	else return n / 2;
    }
}