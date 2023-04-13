

package jdbctut;
import java.sql.*;

public class Test {

	static final String DB_URL = "jdbc:mysql://localhost/member";
	static final String USER = "root";
	static final String PASS = "neha@12";
	static final String QUERY = "SELECT Id, Price, name FROM member.order";


	public static void main(String ... y) {


		try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				System.out.print("ID: " + rs.getInt("Id"));
				System.out.print(", Price: " + rs.getInt("Price"));
				System.out.print(", name: " + rs.getString("name"));
				System.out.println("");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}


}



