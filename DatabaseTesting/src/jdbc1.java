import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {
	
public String columnLabel;
public String columnLabel1;

	public void connect() throws SQLException {
		
		String host="localhost";
		String port="3306";
		//(URL , Username, Password)
		Connection con=	DriverManager.getConnection("jdbc:mysql://"+host+":"+port+ "/QAsalesforce", "root", "Krom123$12");
		Statement s= con.createStatement();	
		ResultSet rs= s.executeQuery("select * from Credentials where Scenario='ZeroBalance'"); /** Result set will fall into an array hence write a while loop is important cos it this
		query is falls into the base array */
		
		
		
		while (rs.next()) {
			
	columnLabel=	rs.getString("UserName");
			
		columnLabel1=	 rs.getString("PassWord");
			
			//System.out.println(columnLabel);
			}

		
	}
	
	public static  void main(String[] args) throws SQLException {
		
		jdbc1 con = new jdbc1();
		con.connect();
		
	
	
	
	}
	}

	
	

