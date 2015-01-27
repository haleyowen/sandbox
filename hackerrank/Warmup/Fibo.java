import java.lang.Integer;
import java.util.Scanner;

public class Fibo {
  private static boolean[] fibonacci = new boolean[Integer.MAX_VALUE];
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    addFib();

    int times = input.nextInt();
    for(int x = 0; x < times; x++) {
      int num = input.nextInt();
      if(fibonacci[num])
        System.out.println("IsFibo");
      else 
        System.out.println("IsNotFibo");
    }
  }

  private static void addFib() {
    int i = 0;
    int first = 0;
    int second = 1;
    while(i < Integer.MAX_VALUE) {
      int temp = first + second;
      fibonacci[temp] = true;
      first = second;
      second = temp;
    }
  }
}
