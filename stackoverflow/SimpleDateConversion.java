import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class SimpleDateConversion {
  public static void main(String[]args) throws Exception {
    String str = "Sun Oct 19 01:00:00 ADT 2014";
    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy");
    sdf.setTimeZone(TimeZone.getTimeZone("ADT"));
    Date date = sdf.parse(str);
    sdf.applyPattern("yyyy/MM/dd zzz hh aa");
    System.out.println(sdf.format(date));
  }
}
    
