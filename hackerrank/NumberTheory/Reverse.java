import java.util.Scanner;
import java.util.Arrays;
public class Reverse {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();

    for(int x = 0; x < times; x++) {
      int n = input.nextInt();
      int k = input.nextInt();
      
      int[] nums = new int[n];
      for(int i = 0; i < n; i++) {
        nums[i] = i;
      }

      for(int i = 0; i < n; i++) {
        for(int j = i; j < n; j++) {
          if(i % 2 == 0) {
            nums[j] = n - nums[j] - 1;
          }
          else {
            nums[j] = n - nums[j] - 2;
          }
        }
      }
      for(int i = 0; i < n; i++) {
        if(nums[i] == k) 
          System.out.println(i);
      }
    }
  }
}
    
