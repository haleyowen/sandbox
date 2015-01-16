import java.io.File;
import java.awt.event.WindowEvent;
import java.io.PrintWriter;

public class ThrowingExceptions {
  public static void main(String[]args) {

  }


  public void windowClosing(WindowEvent e) throws Exception {

    int[] studentNum = new int[12];
    int[] name = new int[1];
    int time = 0;
    int counselor = 0;


    File myFile = new File("GuidanceAppt.txt");
    PrintWriter output = new PrintWriter(myFile);
    for (int i=0;i!=1000;i++){
      output.println(studentNum[i] + " " + name[i] + " " + time + " " + counselor + " ");

    }


  }
}
