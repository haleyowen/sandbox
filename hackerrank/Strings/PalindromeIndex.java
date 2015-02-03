import java.util.Scanner;
import java.lang.StringBuilder;

public class PalindromeIndex {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();
    input.nextLine();

    for(int x = 0; x < times; x++) {
      StringBuilder line = new StringBuilder(input.nextLine());
      boolean already = isPalindrome(line);

      if(already) {
        System.out.println(-1); 
      }

      for(int i = 0; i < line.length() && !already; i++) {
        char let = line.charAt(i);
        line = line.deleteCharAt(i);
        if(isPalindrome(line)) {
          System.out.println(i);
          break;
        }
        line = line.insert(i,let);
      }
    }
  }

  private static boolean isPalindrome(StringBuilder str) {
    System.out.println(str);
    return str.toString().equals(str.reverse().toString());
  }
}
