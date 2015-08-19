import java.util.Scanner;
import java.util.Arrays;

public class Puzzle {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int[] nums = new int[b];
		for(int x = 0; x < b; x++)
			nums[x] = input.nextInt();
		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;
		int start = -1;
		for(int x = 0; x < b - a + 1; x++) {
			int temp = nums[x + a - 1] - nums[x];
			if(Math.min(min, temp) < min)
				min = temp;
		}
		System.out.println(min);
	}
}
		
