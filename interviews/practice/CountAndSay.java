import java.util.Scanner;

public class CountAndSay {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    String number = input.nextLine();

    for(int x = 0; x < 10; x++) {
      String result = "";
      int inc = 0;
      for(int i = 0; i < number.length(); i+=inc) {
        int j = i;
        int count = 0;
        while(j < number.length() && number.charAt(i) == number.charAt(j)) {
          count++;
          j++;
        }
        inc = count;
        result += count + "" + number.charAt(i);
      }
      number = result;
      System.out.println(result);
    }
  }
}




