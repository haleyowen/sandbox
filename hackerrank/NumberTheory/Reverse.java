import java.util.Scanner;
public class Reverse {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();

    for(int x = 0; x < times; x++) {
      int n = input.nextInt();
      int index = input.nextInt();

      String res = "";
      for(int i = 0; i < n; i++) {
        for(int j = n - 1; j >= n - i - 1; j--) {
          num = j - i;
        }
        res += i;
        System.out.println(res);
      }
      System.out.println(res.indexOf(index - 1));
    }
  }
}
    
