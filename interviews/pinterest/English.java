import java.util.Scanner;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class English {
  public static void main(String[]args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Kasey");
    list.add("Brady");
    list.add("Alan");
    list.add("Albert");
    list.add("Caitlin");
    list.add("Haley");
    list.add("Nolan");

    System.out.println(english(list, 4));
  }

  public static String english(ArrayList<String> list, int max) {
    String result = "";

    if(max <= 0) {
      throw new IllegalArgumentException("Max is 0.");
    }

    if(list.size() == 1) 
      return list.get(0);
    if(list.size() == 2) {
      if(max >= 2) { 
        return list.get(0) + " and " + list.get(1);
      } else {
        return list.get(0) + " and 1 more";
      }
    }

    for(int i = 0; i < max && i < list.size(); i++) {
      if(i == list.size() - 1 && max >= list.size()) {
        result += ", and " + list.get(i);
      } else {
        result += list.get(i) + ", ";
      }
    }

    if(max < list.size())
      result += "and " + (list.size() - max) + " more"; 

    return result;
  }
}

