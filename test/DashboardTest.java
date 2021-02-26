package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import adrese.Dashboard;
import adrese.Kredencijali;
import adrese.Pocetna;

public class DashboardTest {

	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
		}

	@Test (priority = 5)
	public void checkDashboardOptions () throws InterruptedException {
		driver.get(Dashboard.URL_DASHBOARD);
		Thread.sleep(1000);
		Dashboard.clickDashboard(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_DASHBOARD;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 6)
	public void checkDashboardOptions1 () throws InterruptedException {
		driver.get(Dashboard.URL_SHIFT);
		Thread.sleep(1000);
		Dashboard.clickShift(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_SHIFT;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 7)
	public void checkDashboardOptions2 () throws InterruptedException {
		driver.get(Dashboard.URL_TIME);
		Thread.sleep(1000);
		Dashboard.clickClock(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_TIME;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 8)
	public void checkDashboardOptions3 () throws InterruptedException {
		driver.get(Dashboard.URL_LEAVE);
		Thread.sleep(1000);
		Dashboard.clickLeave(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_LEAVE;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 9)
	public void checkDashboardOptions4 () throws InterruptedException {
		driver.get(Dashboard.URL_TRAINING);
		Thread.sleep(1000);
		Dashboard.clickTraining(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_TRAINING;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 10)
	public void checkDashboardOptions5 () throws InterruptedException {
		driver.get(Dashboard.URL_STAFF);
		Thread.sleep(1000);
		Dashboard.clickDashboard(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_STAFF;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 11)
	public void checkDashboardOptions6 () throws InterruptedException {
		driver.get(Dashboard.URL_AVAILABILITY);
		Thread.sleep(1000);
		Dashboard.clickDashboard(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_AVAILABILITY;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 12)
	public void checkDashboardOptions7 () throws InterruptedException {
		driver.get(Dashboard.URL_PAYROLL);
		Thread.sleep(1000);
		Dashboard.clickDashboard(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_PAYROLL;
		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority = 13)
	public void checkDashboardOptions8 () throws InterruptedException {
		driver.get(Dashboard.URL_REPORTS);
		Thread.sleep(1000);
		Dashboard.clickDashboard(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Dashboard.URL_REPORTS;
		Assert.assertEquals(actual, expected);

	}
	
}
