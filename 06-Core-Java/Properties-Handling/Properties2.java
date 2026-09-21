

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;
public class Properties2 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("dbConfig.properties");
		if(!f.exists())
			f.createNewFile();
		
		System.out.println(f.exists());
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		
		Set<String> keys = prop.stringPropertyNames();
		System.out.println(keys);
		
	
	}

}
