import java.io.File;
public class MoveFile {
    public static void main(String[] args) {
	try {
	    File a = new File("C:\\folderA\\A.txt");

	    a.renameTo(new File("C:\\folderB\\" + a.getName()));

	    a.delete();
	} catch(Exception e) {
	    e.printStackTrace();
	}
    }
}
