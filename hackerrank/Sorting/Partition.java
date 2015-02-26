public class Partition {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int p = input.nextInt();

    int[] array = new int[n-1];

    for(int x = 0; x < n-1; x++) {
      array[x] = input.nextInt();
    }

    List<Integer> left = new ArrayList<Integer>();
    List<Integer> right = new ArrayList<Integer>();

  }
}
