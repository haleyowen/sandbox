import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;

public class Sticks {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();

    Map<Integer, Integer> numbers = new TreeMap<Integer, Integer>();
    for(int x = 0; x < times; x++) {
      int num = input.nextInt();
      if(numbers.containsKey(num))
        numbers.put(num, numbers.get(num) + 1);
      else
        numbers.put(num, 1);
    }
    System.out.println(times);
    for(int n : numbers.keySet()) {
      if(times - numbers.get(n) != 0)
        System.out.println(times - numbers.get(n));
      times -= numbers.get(n);
    }
  }
}
