import java.util.Scanner;
import java.util.HashMap;

public class Anagram {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();
    input.nextLine();

    for(int x = 0; x < times; x++) {
      String line = input.nextLine();
      System.out.println( anagram(line) );

    }
  }

  private static int anagram(String str) {
    HashMap<Character, Integer> firstHalf = new HashMap<Character, Integer>();
    HashMap<Character, Integer> secondHalf = new HashMap<Character, Integer>();

    if(str.length() % 2 == 1)
      return -1;
    else {
      int len = str.length();
      for(int x = 0; x < len/2; x++) {
        char fChar = str.charAt(x);
        if(firstHalf.containsKey(fChar))
          firstHalf.put(fChar, firstHalf.get(fChar) + 1);
        else if(!firstHalf.containsKey(fChar))
          firstHalf.put(fChar, 1);
        
        char sChar = str.charAt(len/2 + x);
        if(secondHalf.containsKey(sChar))
          secondHalf.put(sChar, secondHalf.get(sChar) + 1);
        else if(!secondHalf.containsKey(sChar))
          secondHalf.put(sChar, 1);
      }

      int result = 0;

      for(char i : secondHalf.keySet()) {
        if(firstHalf.containsKey(i))
          result += Math.min(firstHalf.get(i), secondHalf.get(i));
      }

      return len/2 - result;
    }
  }
}
