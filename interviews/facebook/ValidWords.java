import java.util.Scanner;
import java.io.File;
import java.util.HashSet;

public class ValidWords {
  public static void main(String[]args) throws Exception {
    Scanner input = new Scanner(System.in);
    Scanner dictInput = new Scanner(new File("dictionary.txt"));

    HashSet<String> dict = new HashSet<>();

    while(dictInput.hasNextLine()) {
      dict.add(dictInput.nextLine());
    }
    String str = input.nextLine();
    System.out.println(isValid(str, dict, 0));
  }

  private static boolean isValid(String str, HashSet<String> dict, int x) {
    if(x == str.length())
      return true;
    for(int i = x+1; i < str.length()+1; i++) {
      if(dict.contains(str.substring(x,i))) {
        if(isValid(str,dict,i))
          return true;
      }
    }
    return false;
  }
}

