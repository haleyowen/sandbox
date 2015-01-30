import java.util.Scanner;
import java.util.Arrays;
public class LonelyInteger {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();
    int[] arr = new int[100];
    for(int x = 0; x < times; x++) {
      arr[input.nextInt()]++;
    }
    for(int x = 0; x < arr.length; x++) {
      if(arr[x] == 1)
        System.out.println(x);
    }
  }
}
