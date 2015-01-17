import java.util.Scanner;
import java.lang.Math;

public class XOR {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int r = input.nextInt();
    int l = input.nextInt();
    int max = 0;

    for(int x = r; x <= l; x++) {
      for(int y = x; y <= l; y++) {
        if(Math.max(x ^ y, max) > max)
          max = x ^ y;
      }
    }

    System.out.println(max);
  }
}
