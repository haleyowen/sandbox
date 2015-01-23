import java.util.Scanner;
import java.lang.Integer;

public class FindDigits {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();
    input.nextLine();

    for(int x = 0; x < times; x++) {
      String numStr = input.nextLine();
      int num = Integer.parseInt(numStr);
      int count = 0;

      for(int i = 0; i < numStr.length(); i++) {
        if(numStr.charAt(i) - '0' != 0 && num % (numStr.charAt(i) - '0') == 0)
          count++;
      }

      System.out.println(count);
    }
  }
}

