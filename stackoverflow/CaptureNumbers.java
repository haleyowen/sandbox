import java.util.Scanner;

public class CaptureNumbers {
    public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	String line = scan.nextLine();
	scan = new Scanner(line);
	scan.useDelimiter(" 0 ");

	while(scan.hasNext()) {
	    System.out.println(scan.next());
	}
    }
}
