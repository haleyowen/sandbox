import java.util.Scanner;
import java.util.Arrays;

public class Children {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int k = input.nextInt() - 1;

    int[] nums = new int[size];

    for(int i = 0; i < size; i++)
      nums[i] = input.nextInt();
    Arrays.sort(nums);

    int min = Integer.MAX_VALUE;
    int minIndex = 0;

    for(int i = 0; i < size - k; i++) {
      int tempMin = Math.min(min, nums[i + k] - nums[i]);
      if(tempMin < min) {
        min = tempMin;
        minIndex = i;
      }
    }
    System.out.println(nums[minIndex + k] - nums[minIndex]);
  }
}
