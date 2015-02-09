import java.util.Arrays;
public class merge {
  public static void main(String [] args) {
    int[] array1 = {1, 1, 2, 5, 8, 10};
    int[] array2 = {3, 5, 6, 11, 13, 21, 56, 72};
    System.out.println(Arrays.toString(mergeFunction(array1, array2)));
  }

  public static int[] mergeFunction(int[] array1, int[] array2) {
    int size = array1.length + array2.length;
    int[] returnArray = new int[size];
    int x = 0;
    int y = 0;
    for(int i = 0; i < size; i++) {
      if(x < array1.length && y < array2.length) {
        if(array1[x] < array2[y]) {
          returnArray[i] = array1[x];
          x++;
        }
        else {
          returnArray[i] = array2[y];
          y++;
        }
      }
      else if(x < array1.length) {
        returnArray[i] = array1[x];
        x++;
      }
      else if(y < array2.length) {
        returnArray[i] = array2[y];
        y++;
      }
    }
    return returnArray;
  }
}


