import java.util.Scanner;
import java.util.ArrayList;
public class WordLengths {
	public static void main(String[] args) {
		Scanner kb =  new Scanner(System.in);
		int prev = 0;
		String line = kb.nextLine();
		System.out.println(line);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int x = 0; x <= line.length(); x++) {
			if(x == line.length() || line.charAt(x) == ' ') {
				list.add(x - prev);
				prev = x + 1;
			}
		}
		System.out.println(list);
	}
}