import java.util.Scanner;
 
public class P791A {
     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        int  a = scanner.nextInt(), b = scanner.nextInt(), years = 0;
        while(a <= b)
        {
            years++;
            a *= 3;
            b *= 2;
        }
        
        System.out.println(years);
    }
}