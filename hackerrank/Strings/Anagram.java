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
        if(firstHalf.containsKey(str.charAt(x)))
          firstHalf.put(str.charAt(x), firstHalf.get(str.charAt(x)) + 1);
        else if(!firstHalf.containsKey(str.charAt(x)))
          firstHalf.put(str.charAt(x), 1);

        if(secondHalf.containsKey(str.charAt(len/2 + x)))
          secondHalf.put(str.charAt(len/2 + x), secondHalf.get(str.charAt(len/2 + x)) + 1);
        else if(!secondHalf.containsKey(str.charAt(len/2 + x)))
          secondHalf.put(str.charAt(len/2 + x), 1);
      }

      int result = 0;

      for(char i : secondHalf.keySet()) {
        if(firstHalf.containsKey(i))
          result += secondHalf.get(i) - firstHalf.get(i);
        else
          result += secondHalf.get(i);
      }

      return result;
    }
  }
}
