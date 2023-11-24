import java.util.Scanner;
 
public class P231A {
 
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        int a = 0,b = 0,c = 0;
        int sureness, solvedProblems = 0;
        
        int n = scanner.nextInt();
        //scanner.nextLine();
        for(int i = 0; i < n; i++)
        {
        	sureness = 0;
 
        	a = scanner.nextInt();
        	b = scanner.nextInt();
        	c = scanner.nextInt();
        	
        	sureness = a + b + c;
        	if(sureness >= 2) solvedProblems++;
        }
        
        System.out.println(solvedProblems);
	}
}