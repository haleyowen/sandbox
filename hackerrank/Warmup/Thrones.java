import java.util.Scanner;
import java.lang.StringBuilder;

public class Thrones {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();

    System.out.println(hasPermutationPalindrome(line) ? "YES" : "NO");
  }

  private static boolean hasPermutationPalindrome(String str) {
    return permHelper("", str);
  }

  private static boolean permHelper(String pre, String str) {
    if(str.length() == 0) {
      if(isPalindrome(pre)) {
        System.out.println(isPalindrome(pre));
        return true;
      }
    }
    else {
      for(int i = 0; i < str.length(); i++) {
        permHelper(pre + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
      }
    }
    return false;
  }  

  private static boolean isPalindrome(String str) {
    if(str.equals(new StringBuilder(str).reverse().toString()))
      return true;
    else
      return false;
  }
}
