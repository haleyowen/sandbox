import java.util.Scanner;
public class Words {
    public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	int count = input.nextInt();
	input.nextLine();
	for(int x = 0; x < count; x++) {
	    String word = input.nextLine();
	    if(word.length() > 10)
		System.out.println(word.charAt(0)+""+(word.length()-2)+word.charAt(word.length()-1));
	    else
		System.out.println(word);
	}
    }
}