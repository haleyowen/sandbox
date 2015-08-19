import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class VampireNumber {
  public static void main(String[]args) {
    VampireNumber vampire = new VampireNumber();

    System.out.println(vampire.isVampireNumber(1260));
    System.out.println(vampire.isVampireNumber(345));
    System.out.println(vampire.isVampireNumber(104260));
    System.out.println(vampire.isVampireNumber(4298));
  }

  private boolean isVampireNumber(int num) {
    if(Integer.toString(num).length() % 2 == 1)
      return false;

    List<Integer> factors = findFactors(num);
    char[] numArr = Integer.toString(num).toCharArray();
    Arrays.sort(numArr);
    for(int i = 0; i < factors.size()/2; i++) {
      if(isPermutation(factors.get(i), num, numArr))
        return true;
    }
    return false;
  }

  private List<Integer> findFactors(int num) {
    List<Integer> factors = new ArrayList<>();
    for(int x = 1; x <= num; x++) {
      if(num % x == 0)
        factors.add(x);
    }
    return factors;
  }

  private boolean isPermutation(int factor, int num, char[] numArr) {
    int factor2 = num / factor;
    char[] permNum = (Integer.toString(factor) + Integer.toString(factor2)).toCharArray();
    Arrays.sort(permNum);

    if(Arrays.equals(permNum, numArr))
      return true;
    else 
      return false;
  }
}

    
      
    
