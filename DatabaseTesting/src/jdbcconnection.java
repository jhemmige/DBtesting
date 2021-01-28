import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jdbcconnection {
	
	
	public static  void main(String[] args) throws SQLException {
		
	String host="localhost";
	String port="3306";
	//(URL , Username, Password)
	Connection con=	DriverManager.getConnection("jdbc:mysql://"+host+":"+port+ "/QAsalesforce", "root", "Krom123$12");
	Statement s= con.createStatement();	
	ResultSet rs= s.executeQuery("select * from Credentials where Scenario='ZeroBalance'"); /** Result set will fall into an array hence write a while loop is important cos it this
	query is falls into the base array */
	
	while (rs.next()) {
		
		
	System.out.println(rs.getString("UserName"));
		rs.getString("PassWord");
System.setProperty("webdriver.chrome.driver", "/Users/jayashreehemmige/Downloads/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
	
driver.findElement(By.id("username")).sendKeys(	rs.getString("UserName"));

driver.findElement(By.id("password")).sendKeys(	rs.getString("PassWord"));

	
	
	}
	}

	
	
}
