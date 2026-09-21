

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandeling01 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("dbConfig.properties");
		if(!f.exists())
			f.createNewFile();
		
		System.out.println(f.exists());
		
		Properties prop = new Properties();
		prop.setProperty("url", "Localhost");
		prop.setProperty("username", "hyrtutorials");
		prop.setProperty("password", "hyr123");
		
		FileOutputStream fos = new FileOutputStream(f);
		prop.store(fos,"new prop file is created");

	}

}
