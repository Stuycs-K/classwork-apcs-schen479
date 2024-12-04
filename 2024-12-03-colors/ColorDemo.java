import java.util.*;

public class ColorDemo{
  public static final String RESET = "\u001b[0m";
  public static final String CLEAR = "\u001b[2J";

  public static final String[] COLORS = {
    "\u001b[31m", // Red
    "\u001b[33m", // Yellow
    "\u001b[32m", // Green
    "\u001b[36m", // Cyan
    "\u001b[34m", // Blue
    "\u001b[35m"  // Magenta
  };

  public static void sleep(int milli){
    try{
     Thread.sleep(milli);
    }
    catch(Exception e){
    }
}

public static void main(String[] args) {
  System.out.print(RESET);
  System.out.print(CLEAR);
  int index = 0;

  Scanner scan = new Scanner(System.in);
  System.out.print("Enter your message: ");
  String message = scan.nextLine();

  for (int i = 0; i < message.length(); i++) {
      System.out.print(COLORS[index] + message.charAt(i));
      index = (index + 1) % COLORS.length;
  }

  System.out.print(RESET);
  }
}

