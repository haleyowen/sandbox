import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class DifferentCharaacter {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in); 
    String a = input.next();
    String b = input.next();
   
    System.out.println(getDifferences(a, b));
  }

  public static List<Character> getDifferences(String a, String b) {
    List<Character> list = new ArrayList<>();
    getDifferences(getCharacterCount(a), getCharacterCount(b), list);
    getDifferences(getCharacterCount(b), getCharacterCount(a), list);
    return list;
  }

  public static List<Character> getDifferences(Map<Character, Integer> aCount, Map<Character, Integer> bCount, List<Character> list) {
    for(Character c : aCount.keySet()) {
      Integer cur = aCount.get(c);
      Integer otherCur = bCount.get(c);
      if(otherCur != null && cur > otherCur || otherCur == null) {
        list.add(c);
      } 
    }
    return list;
  }

  public static HashMap<Character, Integer> getCharacterCount(String word) {
    HashMap<Character, Integer> count = new HashMap<>();

    for(int i = 0; i < word.length(); i++) {
      char let = word.charAt(i);
      if(count.get(let) == null) {
        count.put(let, 1);
      } else {
        count.put(let, count.get(let) + 1);
      }
    }
    return count;
  }
}
