import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class Pangram {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    Set<Character> letters = new TreeSet<Character>();
    String line = input.nextLine().toLowerCase();

    for(int i = 0; i < line.length(); i++) {
      if(line.charAt(i) != ' ')
        letters.add(line.charAt(i));
    }

    if(letters.size() >= 26)
      System.out.println("pangram");
    else
      System.out.println("not pangram");
  }
}
