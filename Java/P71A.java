import java.util.Scanner;
 
public class P71A {
 
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String array[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = scanner.next();
            if(array[i].length() > 10)
            {
                array[i] = array[i].charAt(0) + String.valueOf(array[i].length() - 2) + array[i].charAt(array[i].length() - 1);
            }
        }
        
        for(int i = 0; i < n; i++)
        {
           System.out.println(array[i]);
        }
	}
}