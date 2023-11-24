import java.util.Scanner;

/*
 * A - Buy a Shovel
 */

public class P732A
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        short k = scanner.nextShort(), cost = k, quantity = 1;
        byte r = scanner.nextByte();
        scanner.close();

        while(cost % 10 != 0 && (cost - r) % 10 != 0)
        {
            cost += k;
            quantity++;
        }

        System.out.println(quantity);
    }
}