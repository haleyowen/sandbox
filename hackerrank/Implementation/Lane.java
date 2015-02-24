import java.util.Scanner;

public class Lane {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int times = input.nextInt();

    int[] width = new int[n];

    for(int x = 0; x < n; x++) {
      width[x] = input.nextInt();
    }

    for(int x = 0; x < times; x++) {
      int min = 4; 
      int start = input.nextInt();
      int end = input.nextInt();

      for(int i = start; i <= end; i++) {
        if(width[i] < min) 
          min = width[i];
      }
      System.out.println(min);
    }
  }
}
