package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import adrese.Dashboard;
import adrese.NoviZaposleni;

public class NoviZaposleniTest {
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
		}

	@Test (priority = 14)
	public void checkDashboardOptions () throws InterruptedException {
		driver.get(Dashboard.URL_STAFF);
		Thread.sleep(1000);
		Dashboard.clickStaff(driver);
		Thread.sleep(2000);
		NoviZaposleni.inputEmloyeeName(driver, name);
		NoviZaposleni.inputEmployeeLastName(driver, surname);
		NoviZaposleni.inputEmployeeEmail(driver, email);
		NoviZaposleni.clickSaveEmployee (driver);
		String actual = driver.getCurrentUrl();
		String expected = NoviZaposleni.EXPECTED_URL;
		Assert.assertEquals(actual, expected);
		
	
	}
	
}

