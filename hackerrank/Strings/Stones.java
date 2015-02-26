import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashSet;

public class Stones {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);

    int gemSize = input.nextInt();
    input.nextLine();
    
    TreeMap<Character, Integer> stones = new TreeMap<Character, Integer>();

    for(int x = 0; x < gemSize; x++) {
      String line = input.nextLine();
      HashSet<Character> temp = new HashSet<Character>();

      for(char i : line.toCharArray())
        temp.add(i);

      for(char i : temp) {
        if(stones.containsKey(i))
          stones.put(i, stones.get(i) + 1);
        else 
          stones.put(i, 1);
      }
    }
    int count = 0;

    for(char i : stones.keySet()) {
      if(stones.get(i) == gemSize)
        count++;
    }
    System.out.println(count);
  }
}
