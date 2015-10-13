import java.util.Scanner;
import java.util.ArrayList;
public class MovingAverages {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int size = input.nextInt();
    for(int x = 0; x < times; x++) {
      list.add(input.nextInt());
    }
    System.out.println(getAverages(list, size));
  }

  public static ArrayList<Double> getAverages(ArrayList<Integer> list, int size) {
    int prevIndex = 0;
    int curAdd = 0;
    ArrayList<Double> averages = new ArrayList<Double>();
    for(int i = 0; i < size && i < list.size(); i++) {
      curAdd+=list.get(i);
    }
    averages.add((double)curAdd/size);

    for(int i = size; i < list.size(); i++) {
      curAdd -= list.get(prevIndex);
      curAdd += list.get(i);
      prevIndex++;
      averages.add((double)curAdd/size);
    }
    return averages;
  }
}


