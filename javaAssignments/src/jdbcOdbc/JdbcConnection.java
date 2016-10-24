package jdbcOdbc;

import java.sql.*;

public class JdbcConnection {
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		
		Statement stmt=con.createStatement();
		int updates=stmt.executeUpdate("UPDATE DEPT SET NAME='RESEARCHNDEVELOPMENT' WHERE ID=6");
		updates=stmt.executeUpdate("DELETE FROM DEPT WHERE ID=6");
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM DEPT");
		
		while(rs.next())
		{
			System.out.println(rs.getInt("ID")+ " "+ rs.getString("Name"));
		}
		
	}

}
