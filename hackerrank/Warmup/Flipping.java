import java.util.Scanner;
import java.lang.Long;
import java.util.Arrays;

public class Flipping {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();

    for(int x = 0; x < times; x++) {
      long num = input.nextLong();
      String bits = Long.toString(num, 2);

      for(int i = bits.length(); i < 32; i++)
        bits = "0" + bits;

      char[] flip = bits.toCharArray();

      for(int i = 0; i < flip.length; i++) {
        if(flip[i] == '0')
          flip[i] = '1';
        else
          flip[i] = '0';
      }

      long ans = Long.parseLong(new String(flip), 2);

      System.out.println(ans);
    }
  }
}
