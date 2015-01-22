import java.util.Scanner;
import java.util.HashMap;

public class Thrones2 {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    for(char i : line.toCharArray())
      if(map.containsKey(i))
        map.put(i, map.get(i) + 1);
      else
        map.put(i, 1);
    
    int count = 0;
    for(char i : map.keySet())
      if(map.get(i) % 2 != 0)
        count++;

    if(count <= 1)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
