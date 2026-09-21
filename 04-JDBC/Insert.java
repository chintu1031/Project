
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		try {

			// step 1: Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step 2: Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "@1031");
			
			// step 3: Prepare Statement
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id : ");
			int id=sc.nextInt();
			System.out.println("Enter the name : ");
			String name =sc.next();
			System.out.println("Enter the Course : ");
			String course=sc.next();
			String query = "insert into student values(?,?,?)";
			PreparedStatement st= con.prepareStatement(query);
//			st.setInt(1,101);
//			st.setString(2, "shiva");
//			st.setString(3, "JavaFullStack");
			
			st.setInt(1,id);
			st.setString(2, name);
			st.setString(3, course);
			
			
			// step 4: Execute query
			int rows=st.executeUpdate();
			System.out.println("No of Rows affected "+ rows);
			
			//step 5: Close Connections
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
