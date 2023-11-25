import java.util.Scanner;

/*
* A - Unary
*/
 
public class P133B
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();
    
    System.out.println(getAnswer(toBinary(input)));
  }
    
  static String toBinary(String unary)
  {
	  String result = "";
	    for(byte i = 0; i < unary.length(); i++)
	    {
	      if(unary.charAt(i) == '>') result += "1000";
	      else if(unary.charAt(i) == '<') result += "1001";
	      else if(unary.charAt(i) == '+') result += "1010";
	      else if(unary.charAt(i) == '-') result += "1011";
	      else if(unary.charAt(i) == '.') result += "1100";
	      else if(unary.charAt(i) == ',') result += "1101";
	      else if(unary.charAt(i) == '[') result += "1110";
	      else if(unary.charAt(i) == ']') result += "1111";
	    }
	    
	    return result;
  }
  static long getAnswer(String binary)
  {
	  long answer = 0;
      for(int i = 0; i < binary.length(); i++) answer = (answer * 2 + (binary.charAt(i) - '0')) % 1000003;
      
      return answer;
   }
}