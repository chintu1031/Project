

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        try {
        	// step 1: load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step 2: Establish Connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "@1031");
			
			// step 3: Prepare statements
			Statement st= con.createStatement();
			
			// step 4: Execute query
			st.executeUpdate("create table student( id int , name varchar(50) , course varchar(50) )");
			
			// step 5: Close connections
			st.close();
			con.close();
			
			System.out.println( "Student Table is Created Successfully ! Check in DB" );
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
