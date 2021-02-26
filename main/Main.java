package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import adrese.Pocetna;

public class Main {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(Pocetna.URL_ABOUT);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Pocetna.acceptCookies(driver);
		String actual = driver.getCurrentUrl();
		String expected = Pocetna.URL_ABOUT;
		Assert.assertEquals(actual, expected);
		Pocetna.takeSnapShot(driver, Pocetna.SS_DESTINATION);
		
	}

}
