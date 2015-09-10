public class Islands {
  private static int[][] matrix = 
   {{1, 1, 0, 0, 0},
    {0, 1, 0, 0, 1},
    {1, 0, 0, 1, 1},
    {0, 0, 0, 0, 0},
    {1, 0, 1, 0, 1}};
  private static boolean[][] v = new boolean[matrix.length][matrix[0].length];

  public static void main(String[]args) {
    int result = 0;
    for(int r = 0; r < matrix.length; r++) {
      for(int c = 0; c < matrix[0].length; c++) {
       
        result += recurse(r,c);
      }
    }
    System.out.println(result);
  }

  // change up parameters to replace wrapper
  private static int recurse(int r, int c) {

    if(!(r < matrix.length && r >= 0 && c < matrix[0].length && c >= 0 && matrix[r][c] == 1 && !v[r][c]))
      return 0;

    v[r][c] = true;
    recurse(r+1,c);
    recurse(r-1,c);
    recurse(r,c+1);
    recurse(r, c-1);
    recurse(r+1,c+1);
    recurse(r-1,c-1);
    recurse(r+1,c-1);
    recurse(r-1,c+1);
    return 1;
  }
}

