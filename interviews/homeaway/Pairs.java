import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class Pairs {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<Integer>();
    int sum = input.nextInt();
    input.nextLine();
    Scanner line = new Scanner(input.nextLine());
    while(line.hasNextInt()) {
      numbers.add(line.nextInt());
    }
    getPairs(numbers, sum);
  }

  public static void getPairs(List<Integer> numbers, int sum) {
    HashMap<Integer, Integer> count = new HashMap<>();

    for(int x = 0; x < numbers.size(); x++) {
      int e = numbers.get(x);
      if(count.get(e) == null)
        count.put(e, 0);
      count.put(e, count.get(e)+1);
    }
    for(int x = 0; x < numbers.size(); x++) {
      if(count.containsKey(sum - numbers.get(x))) {
        if(sum - numbers.get(x) == numbers.get(x) && count.get(numbers.get(x)) >= 2 || sum - numbers.get(x) != numbers.get(x))
          System.out.println(numbers.get(x) + " " + (sum - numbers.get(x)));
      }
    }
  }
}


