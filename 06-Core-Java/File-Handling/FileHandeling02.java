
import java.io.File;
import java.io.IOException;

public class FileHandeling02 {

	public static void main(String[] args) throws IOException {
		File f = new File("./JavaTutorials.txt");
		if(!f.exists())
			f.createNewFile();
		System.out.println(f.exists());
	}

}
