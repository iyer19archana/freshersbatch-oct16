package jdbcOdbc;
import java.io.FileInputStream;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedCallable {

		public static void main(String args[]) throws Exception
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			
			PreparedStatement pstmt=con.prepareStatement("UPDATE DEPT SET NAME=? WHERE ID=?");
			
			pstmt.setString(1, "Research and development");
			pstmt.setInt(2,7);
			
			int updates=pstmt.executeUpdate();
			
			PreparedStatement pstmt_select=con.prepareStatement("SELECT * FROM DEPT");
			ResultSet rs=pstmt_select.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt("ID")+ " "+ rs.getString("Name"));
			}
			
			
			//PreparedStatement pstmt2=con.prepareStatement("INSERT INTO PIC(ID,NAME,PHOTO) VALUES (?,?,?)");
			//pstmt2.setInt(1, 1);
			//pstmt2.setString(2,"Tom");
			
			
			//File file=new File("D:/freshtraining/freshersbatch-oct16/jdbc.jpg");
			//FileInputStream fis=new FileInputStream(file);
			//pstmt2.setBinaryStream(3, fis, file.length());
			//pstmt2.setAsciiStream(3, fis, file.length());
			//int up2=pstmt2.executeUpdate();
			
			
			PreparedStatement pstmt2_select=con.prepareStatement("SELECT PHOTO FROM PIC");
			ResultSet rs2=pstmt2_select.executeQuery();
			byte[] fileBytes;
			while(rs2.next())
			{
				fileBytes=rs2.getBytes(1);
			//File file1=new File("D:/freshtraining/freshersbatch-oct16/jdbc.jpg");
			FileOutputStream fos=new FileOutputStream("D:/freshtraining/freshersbatch-oct16/new.jpg");
			fos.write(fileBytes);
			fos.close();
			
			PreparedStatement pstmt3_insert=con.prepareStatement("INSERT INTO EMP_COPY (ID,NAME) VALUES(?,?)");
			PreparedStatement pstmt2_copy=con.prepareStatement("SELECT * FROM EMP");
			ResultSet rs3=pstmt2_copy.executeQuery();
			while(rs3.next())
			{
				pstmt3_insert.setInt(1, rs3.getInt("ID"));
				pstmt3_insert.setString(2, rs3.getString("NAME"));
				
			pstmt3_insert.addBatch();
			}
			pstmt3_insert.executeBatch();
			
			}
			
			
			
			
			
			

	}

}
