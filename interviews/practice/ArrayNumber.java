import java.util.Scanner;
import java.util.Arrays;
public class ArrayNumber {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
      arr[i] = input.nextInt();
    }
    System.out.println(Arrays.toString(plusOne(arr)));
  }

  public static int[] plusOne(int[] arr) {
    int len = arr.length;
    if(arr[len-1] != 9)
      arr[len-1]++;
    else {
      boolean resize = true;
      for(int i = 0; i < len; i++) {
        if(arr[i] != 9)
          resize = false;
      }
      if(resize) {
        arr = new int[len + 1];
        arr[0] = 1;
      } else {
        boolean done = false;
        for(int i = len - 1; i >= 0; i--) {
          if(!done && arr[i] == 9)
            arr[i] = 0;
          else if(!done && arr[i] != 9) {
            arr[i]++;
            done = true;
          }
        }
      }
    }
    return arr;
  }
}





