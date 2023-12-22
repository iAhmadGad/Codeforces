import java.util.Scanner;

/*
* A - Short Substrings
*/

public class P1367A
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        for(short i = 0; i < t; i++) System.out.println(getString(scanner.next()));
        scanner.close();
        System.exit(0);
    }
    
    public static String getString(String b)
    {
        String secret = "" + b.charAt(0);
        for(byte i = 1; i < b.length() - 1; i+= 2) secret += b.charAt(i);
        secret += b.charAt(b.length() - 1);
        return secret;
    }
}
