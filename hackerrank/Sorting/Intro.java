import java.util.Scanner;

public class Intro {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);

    int val = input.nextInt();
    input.nextInt();

    int i = 0;

    while(input.hasNext()) {
      if(input.nextInt() == val) {
        System.out.println(i);
        break;
      }
      i++;
    }
  }
}
