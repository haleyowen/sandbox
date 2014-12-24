import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class LargeFileReader {
	public static void main(String[]args0) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("largeFile.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
	}
}