
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "@1031");
			
			String query = "update student set id =? where course=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1,102);
			st.setString(2, "jdbc");
			
			int rowsMod = st.executeUpdate();
			System.out.println(rowsMod+"rows affected ");
			
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
