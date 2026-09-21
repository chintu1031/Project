

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class UpdatingValue {

	public static void main(String[] args) throws IOException {
		
		File f = new File("dbConfig.properties");
		if(!f.exists())
			f.createNewFile();
		
		System.out.println(f.exists());
		Properties prop=new Properties();
		FileOutputStream fos = new FileOutputStream(f);
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		prop.setProperty("url", "123.24.542.5");
		prop.store(fos, "updated url");
		
		
		
		
		System.out.println(prop);

	}

}
