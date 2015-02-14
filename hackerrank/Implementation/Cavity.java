import java.util.Scanner;
import java.util.Arrays;

public class Cavity {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    input.nextLine();
    char[][] cavities = new char[size][size];

    for(int i = 0; i < size; i++) {
      cavities[i] = input.nextLine().toCharArray();
    }

    for(int i = 1; i < size - 1; i++) {
      for(int j = 1; j < size - 1; j++) {
        char cur = cavities[i][j];
        if(cavities[i-1][j] < cur && cavities[i+1][j] < cur && cavities[i][j+1] < cur && cavities[i][j-1] < cur) {
          cavities[i][j] = 0;
        }
      }
    }

    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        if(cavities[i][j] == 0)
          System.out.print('X');
        else
          System.out.print(cavities[i][j]);
      }
      System.out.println();
    }
  }
}
