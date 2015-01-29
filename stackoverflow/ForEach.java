
public class ForEach {
  public static void main(String[]args) {
    String [] names = new String[]{"A","B","C"};
    for(String n: names){
      n = new String(n+"hello");
    }
    System.out.println(names);
  }
}
