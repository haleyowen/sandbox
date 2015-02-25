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
        char let = line.charAt(i);
        line = line.replace(Character.toString(let), "");
        if(isPalindrome(line)) {
          System.out.println(i);
          break;
        }
        line = line.substring(0,i) + let + line.substring(i);
      }
    }
  }

  private static boolean isPalindrome(String str) {
    for(int i = 0; i < str.length()/2; i++) {
      if(str.charAt(i) != str.charAt(str.length() - i))
        return false;
    }
    return true;
  }
}
