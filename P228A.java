import java.util.Scanner;
import java.util.HashSet;

/*
* A - Is your horseshoe on the other hoof?
*/

public class P228A
 {
   public static void main(String args[])
   { 
    Scanner scanner = new Scanner(System.in);
    HashSet<Integer> set = new HashSet<Integer>();
    for(byte i = 0; i < 4; i++) set.add(scanner.nextInt());
    System.out.println(4 - set.size());
   }
 }
