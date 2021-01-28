import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SalesForceExtension {

	static jdbc1 jdbc;
	WebDriver driver;

	@Test
	public void jdbcmethod() throws SQLException {
		System.setProperty("webdriver.chrome.driver", "/Users/jayashreehemmige/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

		jdbc = new jdbc1();
		jdbc.connect();

System.out.println(jdbc.columnLabel);
		System.out.println(jdbc.columnLabel1);
		driver.findElement(By.id("username")).sendKeys(jdbc.columnLabel);
		driver.findElement(By.id("password")).sendKeys(jdbc.columnLabel1);

	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}

	public static void main(String[] args) throws SQLException {

	}

}
