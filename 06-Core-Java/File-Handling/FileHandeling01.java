
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandeling01 {

	public static void main(String[] args) throws IOException {
		 File f = new File("C:\\Users\\shiva\\OneDrive\\Desktop\\File\\resume.txt");
		 if(!f.exists())
			 f.createNewFile();
		 
//		 FileInputStream fis = new FileInputStream(f);
////		 System.out.println((char)fis.read());
//		 int ascii;
//		 
//		 while((ascii= fis.read())!=-1 ) {
//			 System.out.print((char)ascii);
//			 
//		 }
//		 fis.close();
		 
//		 Scanner sc = new Scanner(f);
//		 while(sc.hasNext()) {
//			 System.out.println(sc.next());
//		 }
//		 System.out.println("*******************************");
//		 while(sc.hasNextLine()) {
//			 System.out.println(sc.nextLine());
//		 }
//		 sc.close();
		 
		 
		 FileReader fr = new FileReader(f);
//		 int ascii;
//		 while((ascii=fr.read())!=-1) {
//			 System.out.print((char)ascii);
//		 }
//		 fr.close();
		 
		 BufferedReader br = new BufferedReader(fr);
//		 int ascii;
//		 while((ascii=br.read())!=-1) {
//			 System.out.print((char)ascii);
//		 }
		 
		 
		 String str = new String();
		 while((str = br.readLine())!=null) {
			 System.out.println(str);
		 }	 
		 br.close();
		 fr.close();

	}
	
} 
