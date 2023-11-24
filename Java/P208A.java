import java.util.Scanner;

/*
 * A - Dubstep
 */

public class P208A 
{
	public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        for(String output : input.split("WUB")) System.out.print(output + " ");
    }
}