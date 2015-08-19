import java.util.Scanner;
import java.lang.Character;
import java.math.BigInteger;

public class Cypher {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String publicKey = input.nextLine();
		BigInteger a = new BigInteger(input.next());
		BigInteger b = new BigInteger(input.next());

		String leftAnswer = null;
		String rightAnswer = null;
		String leftString = Character.toString(publicKey.charAt(0));
		String rightString = publicKey.substring(1, publicKey.length());

		for(int i = 1; i < publicKey.length(); i++) {
			BigInteger left = new BigInteger(leftString);
			BigInteger right = new BigInteger(rightString);

			if(rightString.charAt(0) != '0' && left.mod(a).compareTo(new BigInteger("0")) == 0 && right.mod(b).compareTo(new BigInteger("0")) == 0) {
				leftAnswer = left.toString();
				rightAnswer = right.toString();
			}
			String temp = Character.toString(rightString.charAt(0));
			rightString = rightString.replaceFirst(temp, "");
			leftString += temp;
		}

		if(leftAnswer != null && rightAnswer != null) {
			System.out.println("YES\n" + leftAnswer + "\n" + rightAnswer + "\n");
		}
		else {
			System.out.println("NO");
		}
	}
}