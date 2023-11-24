import java.util.Scanner;
 
public class P4A {
    public static void main(String[] args) {
   
        Scanner getInput = new Scanner(System.in);
        byte w = getInput.nextByte();
 
        if (w % 2 == 0 && w != 2)
        {
         System.out.println("YES");
        }
        else
        {
         System.out.println("NO");
        }
    
    }
}
