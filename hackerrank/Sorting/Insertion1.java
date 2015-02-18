import java.util.Scanner;
import java.util.Arrays;

public class Insertion1 {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    int[] arr = new int[size];

    for(int x = 0; x < size; x++) 
      arr[x] = input.nextInt();

    for(int i = 1; i < size; i++) {
      int cur = arr[i];
      int j = i - 1;
      while(j >= 0 && cur < arr[j]) {
        arr[j+1] = arr[j];
        j--;
        System.out.println(Arrays.toString(arr));
      }
      arr[j+1] = cur;
    }
    System.out.println(Arrays.toString(arr));
  }
}
