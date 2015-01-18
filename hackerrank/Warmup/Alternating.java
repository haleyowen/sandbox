import java.util.Scanner;

public class Alternating {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int times = input.nextInt();
    input.nextLine();

    for(int x = 0; x < times; x++) {
      char[] line = input.nextLine().toCharArray();
      int count = 0;

      char let = line[0];
      
      for(int i = 1; i < line.length; i++) {
        if(line[i] == let) {
          line[i] = 0;
          count++;
        }
        else {
          let = line[i];
        }
      }
      System.out.println(count);
    }
  }
}

