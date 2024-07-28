import java.util.Scanner;

/*
* A - Goals of Victory
*/

public class P1877A
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        for(short i = 0; i < t; i++)
        {
            byte n = scanner.nextByte();
            int sum = 0;
            for(byte j = 0; j < n - 1; j++) sum += (int) scanner.nextByte();
            System.out.println(-sum);
        }
        scanner.close();
        System.exit(0);
    }
}
