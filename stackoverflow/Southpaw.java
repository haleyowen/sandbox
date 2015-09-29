import java.util.Scanner;
public class Southpaw {
  public static void main(String [] args)
  {
    double x1;
    double x2; 
    double y1; 
    double y2;
    Scanner length = new Scanner(System.in);

    System.out.println("Enter x1 and y1");
    x1= length.nextDouble();
    y1= length.nextDouble();

    System.out.println("Enter x2 and y2");
    x2= length.nextDouble();
    y2= length.nextDouble();

    System.out.println(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
  }
}
