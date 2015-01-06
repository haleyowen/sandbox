import java.util.*;
import java.lang.*;
import java.io.*;

class Quad implements Comparable {
  public int x, y, dist;

  public Quad(int i, int j) {
    x = i;
    y = j;
    dist = y - x;
  }

  public int compareTo(Object obj) {
    Quad q = (Quad)obj;

    if(x == q.x) {
      if(dist > q.dist)
        return -1;
    }
    if(x < q.x)
      return -1;
    return 1;
  }
}

public class Ideone {
  public static void main (String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      t--;
      int n = sc.nextInt();
      Quad[] q = new Quad[n];

      for(int i = 0; i < n; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        q[i] = new Quad(u,v);
      } 

      Arrays.sort(q);
      int max = q[0].y;
      int k=0;

      for(int i = 0; i < n - 1; i++) {
        int quadK = q[k].y;
        int quadI = q[i + 1].y;

        if(q[k].x == q[i + 1].x) {
          if(max < quadI) {

            quadK ^= quadI;
            quadI ^= quadK;
            quadK ^= quadI;
            max = quadK;
          }
        } 
        else {
          k = i + 1;
          max = quadK;
        }
      }
    }
  }
}
