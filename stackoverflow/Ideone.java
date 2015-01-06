import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Quad implements Comparable {
  int x,y;
  public Quad(int i,int j) {
    x = i;
    y = j;
  }
  int dist = y-x;
  public int compareTo(Object obj) {
    Quad q;
    q = (Quad) obj;
    if((Integer) (this.x) == (Integer) (q.x)) {
      if(this.dist>q.dist)
        return -1;
    }
    if(this.x<q.x)
      return -1;
    return 1;
  }
}
class Ideone {
  public static void main (String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t --> 0) {
      int n = sc.nextInt();
      Quad[] q = new Quad[n];
      for(int i = 0;i < n; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        q[i] = new Quad(u,v);
      } Arrays.sort(q);
      int max = q[0].y, k=0;
      for(int i = 0;i < n - 1;i++) {
        if(q[k].x == q[i+1].x) {
          if(max < q[i+1].y) {
            q[k].y = q[k].y^q[i + 1].y;
            q[i + 1].y=q[k].y^q[i + 1].y;
            q[k].y=q[k].y^q[i+1].y;
            max = q[k].y;
          }
        } else {
          k = i+1;
          max = q[k].y;
        }
      }
    }
  }
}
      //for(int i =0;i<n;i++){ 
      //      // out.print(q[i].x +" "); 
      //            // out.println(q[i].y); 
      //                  //}
      //                        int count = 1, flag = 0;
      //                              int y1 = q[0].y;
      //                                    for(int i = 0;i < n - 1;i++) {
      //                                            if(y1 - q[i+1].x<0) {
      //                                                      count++;
      //                                                                y1 = q[i + 1].y;
      //                                                                          flag = 1;
      //                                                                                  }
      //                                                                                          if(q[i].x == q[i + 1].x && y1-q[i + 1].y < 0 && flag == 0) {
      //                                                                                                    y1 = q[i+1].y;
      //                                                                                                              continue;
      //                                                                                                                      }
      //                                                                                                                              //if(y1-q[i+1].x>0&&flag == 0&&q[i].x!=q[i+1].x&&){
      //                                                                                                                                      // y1 = q[i+1].y;
      //                                                                                                                                              //} } System.out.println(count);
      //                                                                                                                                                    }
      //                                                                                                                                                        } 
      //                                                                                                                                                          }
      //                                                                                                                                                          }
