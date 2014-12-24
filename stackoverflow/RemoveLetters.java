import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Character;
import java.lang.Integer;
import java.util.Scanner;
import java.io.File;

public class RemoveLetters {
	public static void main(String [] args) throws Exception {
		Scanner file = new Scanner(new File("letters.txt"));
		char[] line = file.nextLine().toCharArray();
		int times = file.nextInt();
		Map<Character, List<Integer>> indexes = new HashMap<Character, List<Integer>>();

		for(int i = 0; i < line.length; i++) {
			char let = line[i];

			if(indexes.containsKey(let)) {
				indexes.get(let).add(i);
			}
			else {
				indexes.put(let, new ArrayList<Integer>());
				indexes.get(let).add(i);
			}
		}

		for(int i = 0; i < times; i++) {
			int num = file.nextInt() - 1;
			char let = file.next().charAt(0);
			int removeIndex = indexes.get(let).get(num);

			line[removeIndex] = 0;
			indexes.get(let).remove(num);
		}
		System.out.println(line);
	}
}