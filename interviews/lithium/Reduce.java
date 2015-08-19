import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Reduce {
  public static void main(String[]args) {
    Reduce reduce = new Reduce();
    List<String> emails = new ArrayList<String>();
    emails.add("a@b.com");
    emails.add("b@c.com");
    emails.add("e@f.com");
    emails.add("b@c.com");
    emails.add("a@b.com");
    emails.add("a@b.com");
    System.out.println((reduce.reduceEmailList(emails)));
  }

  private List<List<String>> reduceEmailList(List<String> emails) {
    HashMap<String, Integer> emailCount = new HashMap<>();
    for(String e : emails) {
      if(emailCount.containsKey(e))
        emailCount.put(e, emailCount.get(e) + 1);
      else 
        emailCount.put(e, 1);
    }

    List<List<String>> results = new ArrayList<>();
    for(String e : emailCount.keySet()) {
      results.add(getEmailList(e, emailCount.get(e)));
    }
    return results;
  }

  private List<String> getEmailList(String email, int count) {
    List<String> emailList = new ArrayList<>();
    for(int x = 0; x < count; x++) {
      emailList.add(email);
    }
    return emailList;
  }
}
