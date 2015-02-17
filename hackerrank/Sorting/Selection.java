import java.util.Scanner;
import java.util.Arrays;

public class Selection {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    int[] arr = new int[size];

    for(int x = 0; x < size; x++)
      arr[x] = input.nextInt();

    for(int i = 0; i < size - 1; i++) {
      for(int j = i + 1; j < size; j++) {
        if(arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      System.out.println(Arrays.toString(arr));
    }
  }
}
