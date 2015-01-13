import java.util.Scanner;

public class Second {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();

    for(int x = 0; x < times; x++)
      System.out.println(input.nextInt() + input.nextInt());
  }
}
