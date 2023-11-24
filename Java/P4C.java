import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * C - Registration system
 */

public class P4C {

	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String current;
		
		HashMap<String, Integer> db = new HashMap<String, Integer>();
		
		for(int i = 0; i < n; i++)
		{
			current = reader.readLine();
			if(!db.containsKey(current))
			{
				db.put(current, 0);
				System.out.println("OK");
			}
			else
			{
				db.put(current, db.get(current) + 1);
				System.out.println(current + db.get(current));
			}
		}
	}
}
