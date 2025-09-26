package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Fetch_Record {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		Statement stmt=con.createStatement();
		
	//	int result = stmt.executeUpdate("insert into tejasvini values(11,'ram','hadapsar')");
	//	int result = stmt.executeUpdate("update tejasvini set name='vimal' where id=3");
		int result = stmt.executeUpdate("delete from tejasvini where id=30");
		
		System.out.println(result+"records affected");
		con.close();
		

	}

}
