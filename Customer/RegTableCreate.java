package studioManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegTableCreate {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studio_db","root","");
			
			Statement stm = con.createStatement();
			
			String sql = "CREATE TABLE customer_info(id Integer not NULL PRIMARY KEY AUTO_INCREMENT,name varchar(30) not NULL,age Integer not NULL,email varchar(30) not null,phoneno varchar(15) not null,address varchar(40) not null,password varchar(10) not null)";
			stm.executeUpdate(sql);
			System.out.println("table created");
			}
			catch(SQLException | ClassNotFoundException e){
				e.printStackTrace();
			}
		
		
	}


}
