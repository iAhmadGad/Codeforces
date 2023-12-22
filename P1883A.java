import java.util.Scanner;

/*
 * A - Morning
 */
 
public class P1883A
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) System.out.println(getSeconds(scanner.next()));
        scanner.close();
        System.exit(0);
    }
    
    public static int getSeconds(String pin)
    {
        int previous = 1, current = previous, seconds = 0;
        for(int i = 0; i < 4; i++)
        {
            previous = current;
            if(pin.charAt(i) == '0') current = 10;
            else current = pin.charAt(i) - '0';
            seconds += Math.abs(current - previous) + 1;
        }
        return seconds;
    }
}
