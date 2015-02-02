import java.util.Scanner;
import java.lang.StringBuilder;

public class PalindromeIndex {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();
    input.nextLine();

    for(int x = 0; x < times; x++) {
      String line = input.nextLine();
      boolean already = isPalindrome(line);

      if(already) {
        System.out.println(-1); 
      }

      for(int i = 0; i < line.length() && !already; i++) {
        String temp = line.substring(0, i) + line.substring(i+1);
        if(isPalindrome(temp)) {
          System.out.println(i);
          break;
        }
      }
    }
  }

  private static boolean isPalindrome(String str) {
    return str.equals(new StringBuilder(str).reverse().toString());
  }
}
