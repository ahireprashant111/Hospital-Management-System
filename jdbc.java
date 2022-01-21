
import java.sql.*;

public class jdbc {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/siom","root","");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from student");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		con.close();  
}
}

