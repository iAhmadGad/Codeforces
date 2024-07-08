import java.util.Scanner;
 
/*
* Insomnia cure
*/
 
public class P148A
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    byte n[] = new byte[4];
    for(byte i = 0; i < 4; i ++) n[i] = scanner.nextByte();
    int d = scanner.nextInt(), counter = 0;
    scanner.close();
    if(n[0] == 1 || n[1] == 1 || n[2] == 1 || n[3] == 1)
    {
      counter = d;
      d = 0;
    }
    for(int i = 1; i <= d; i++)
    {
      if(i % n[0] == 0 || i % n[1] == 0 || i % n[2] == 0 || i % n[3] == 0) counter++;
    }
    System.out.println(counter);
  }
}