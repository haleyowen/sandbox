import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class T9AutoComplete {
  static Map<Character, List<String>> dictionary = new HashMap<>();
  static String[] lookup = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
  static String[] dictionaryWords = {"apple", "tree", "homework", "hello", "bee", "brady", "bread", "beecave", "beehive", "hey", "today", "tomorrow", "to"};

  public static void main(String[]args) {
    List<String> temp = Arrays.asList(dictionaryWords);
    for(String s : temp) {
      if(dictionary.get(s.charAt(0)) == null) {
        dictionary.put(s.charAt(0), new ArrayList<String>());
      }
      dictionary.get(s.charAt(0)).add(s);
    }
    Scanner input = new Scanner(System.in);
    String numbers = input.nextLine();
    for(int i = 0; i < numbers.length(); i++) {
      String letters = lookup[numbers.charAt(i) - 48];

        redoDictionary(letters, i+1);
    }

    for(Character c : dictionary.keySet()) {
      List<String> tempWords = dictionary.get(c);
      for(String w : tempWords)
        System.out.print(w + " ");
    }
    System.out.println();
  }
  
  private static void redoDictionary(String lookupChars, int index) {
    Map<Character, List<String>> newDictionary = new HashMap<>();
    
    List<String> words = new ArrayList<>();
    
    for(int x = 0; x < lookupChars.length(); x++) {
      if(dictionary.get(lookupChars.charAt(x)) != null)
        words.addAll(dictionary.get(lookupChars.charAt(x)));
    }
   // clear original dictionary instead of making new map
    
    for(int i = 0; i < words.size(); i++) {
      String word = words.get(i);
      if(word.length() > index) {
        if(newDictionary.get(word.charAt(index)) == null)
          newDictionary.put(word.charAt(index), new ArrayList<String>());
        newDictionary.get(word.charAt(index)).add(word);
      }
    }
    dictionary = newDictionary;
  }
}


