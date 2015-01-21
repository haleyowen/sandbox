import java.util.Scanner;

public class LetterMystery {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();
    input.nextLine();

    for(int x = 0; x < times; x++) {
      char[] line = input.nextLine().toCharArray();
      int count = 0;

      for(int i = 0; i < line.length/2; i++) {
        count += Math.abs(line[line.length - i - 1] - line[i]);
      }
      System.out.println(count);
    }
  }
}
        
          
