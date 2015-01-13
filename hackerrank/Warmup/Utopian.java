import java.util.Scanner;

public class Utopian {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();

    for(int i = 0; i < times; i++) {
      int treeSize = 1;
      int n = input.nextInt();

      for(int x = 0; x < n/2; x++) {
        treeSize *= 2;
        treeSize++;
      }

      if(n % 2 != 0)
        treeSize *=2;

      System.out.println(treeSize);
    }
  }
}
