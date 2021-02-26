package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import adrese.Login_Kredencijali;

public class LoginTest {
	
public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
		}


	@Test (priority = 4)

	public void clicklogin () throws Exception {
		driver.get(Login_Kredencijali.LOGIN);
		Login_Kredencijali.inputKredencijali1(driver, Login_Kredencijali.USERNAME);
		Login_Kredencijali.inputKredencijali2(driver, Login_Kredencijali.PASSWORD);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Login_Kredencijali.SUCCESSFUL_LOGIN;
		Assert.assertEquals(actual, expected);
		}
}