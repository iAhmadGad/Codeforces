import java.util.Scanner;

/*
 * A - Anton and Polyhedrons
 */

public class P785A 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), counter = 0;
		
		for(int i = 0; i < n; i++)
		{
			String current = scanner.next();
			if(current.compareTo("Tetrahedron") == 0) counter += 4;
			else if(current.compareTo("Cube") == 0) counter += 6;
			else if(current.compareTo("Octahedron") == 0) counter += 8;
			else if(current.compareTo("Dodecahedron") == 0) counter += 12;
			else counter += 20;
		}
		scanner.close();
		System.out.println(counter);
	}
}
