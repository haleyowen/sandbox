import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Lecture {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();

    Map<String, String> languages = new TreeMap<String, String>();

    for(int i = 0; i < m; i++) {
      String first = input.next();
      String second = input.next();

      String prefer = (first.length() <= second.length()) ? first : second;

      languages.put(first, prefer);
    }

    for(int i = 0; i < n; i++) {
      System.out.print(languages.get(input.next()) + " ");
    }
    System.out.println();
  }
}
      
