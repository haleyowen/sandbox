import java.util.Scanner;
import java.lang.Integer; 

public class Giga {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int floor = input.nextInt() + 1;
		boolean stop = false;
		int count = 1;

		while(!stop) {
			String floorStr = Integer.toString(floor);
			if(floorStr.contains("8")) {
				System.out.println(count);
				stop = true;
			}
			else {
				floor++;
				count++;
			}
		}
	}
}