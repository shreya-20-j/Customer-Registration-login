package studioManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TabCreate {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studio_db","root","");
			
			Statement stm = con.createStatement();
			
			String sql = "CREATE TABLE customer(Customer_id Integer not NULL PRIMARY KEY AUTO_INCREMENT,Name varchar(20) not NULL,Place varchar(20) not null,Phone_number varchar(15) not null)";
			stm.executeUpdate(sql);
			System.out.println("table created");
			}
			catch(SQLException | ClassNotFoundException e){
				e.printStackTrace();
			}
		
		
	}


}
