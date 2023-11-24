import java.util.Scanner;
import java.util.ArrayList;
 
/*
* A - Expression
*/
 
public class P479A
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Byte> list = new ArrayList<Byte>();
    for(byte i = 0; i < 3; i++) list.add(scanner.nextByte());
    
    if(list.get(0) == 1) list.set(1, (byte) (list.get(1) + 1));
    
    if(list.get(1) == 1)
    {
      if((list.get(0) + list.get(1)) * list.get(2) > list.get(0) * (list.get(1) + list.get(2))) list.set(0, (byte) (list.get(0) + 1));
      else list.set(2, (byte) (list.get(2) + 1));
    }
    
    if(list.get(2) == 1) list.set(1, (byte) (list.get(1) + 1));
      
      for(byte i = 0; i < list.size(); i++)
    {
      if(list.get(i) == 1)
      {
      list.remove(i);
      i--;
      }
    }
    
    short output = 1;
    for(byte i = 0; i < list.size(); i++) output *= list.get(i);
    
    System.out.println(output);
  }
}