package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import adrese.Kredencijali;
import adrese.Login_Kredencijali;
import adrese.Pocetna;

public class TestPocetna {
	
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
		}
	
	
	
	
	@Test (priority = 1)
	public void startFreeTrialFirstWay () throws InterruptedException {
		driver.get(Pocetna.URL);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Pocetna.acceptCookies(driver);
		Pocetna.clickX(driver);
		Pocetna.inputFullName(driver, Kredencijali.IME);
		Pocetna.inputWorkEmail(driver, Kredencijali.EMAIL);
		Pocetna.clickStartForFirstWay(driver);
		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String expected = Pocetna.URL_AFTER;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 2)
	public void startFreeTrialSecondWay () throws InterruptedException {
		driver.get(Pocetna.URL);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Pocetna.acceptCookies(driver);
		Pocetna.clickX(driver);
		Pocetna.clickStart1ForSecondWay(driver);
		Pocetna.inputFullName2(driver, Kredencijali.IME);
		Pocetna.inputWorkEmail2(driver, Kredencijali.EMAIL);
		Pocetna.clickStart2ForSecondWay(driver);
		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String expected = Pocetna.URL_AFTER;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 3)
	public void aboutUs () throws Exception {
		driver.get(Pocetna.URL_ABOUT);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Pocetna.acceptCookies(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Pocetna.URL_ABOUT;
		Assert.assertEquals(actual, expected);
		Pocetna.takeSnapShot(driver, Pocetna.SS_DESTINATION); 
		
	}
	
/*	@Test (priority = 4)
	
	public void clicklogin () throws Exception {
		driver.get(Login_Kredencijali.LOGIN);
		Login_Kredencijali.inputKredencijali1(driver, Login_Kredencijali.USERNAME);
		Login_Kredencijali.inputKredencijali2(driver, Login_Kredencijali.PASSWORD);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Login_Kredencijali.SUCCESSFUL_LOGIN;
		Assert.assertEquals(actual, expected);
	
		*/
		
		
		
		
//		novog usera
//		popuni sva polja na pop-upu gde ima lozinka
//		
//		
//
//	}
	
//	@Test (priority = 5)
//	public void aboutUs () throws Exception {
//		za svaku stavku menija getujem text
//		i uporedim sa url-om koji dobijem kad kliknem na tu stavku menija
//	String imeStavkeMenija = driver.findElement(By.xpath(neki )).getText();
//		
//
//	}
	
	
}
