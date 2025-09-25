package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

public class First_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select* from EMPLOYEES");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
				
			}
			con.close();
			
		}
			catch(Exception e) {
	System.out.println(e);
}


	}

	}


