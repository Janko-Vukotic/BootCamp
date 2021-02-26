package adrese;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NoviZaposleni {

	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span/p";
	public static final String ADD_EMPLOYEE_XPATH = "//*[@id=\"act_primary\"]";
	public static final String EMPLOYEE_NAME = "//*[@id=\"_asf1\"]";
	public static final String EMPLOYEE_LAST_NAME = "//*[@id=\"_asl1\"]";
	public static final String EMPLOYEE_EMAIL = "//*[@id=\"_ase1\"]";
	public static final String SAVE_EMPLOYEE = "//*[@id=\"_as_save_multiple\"]";
	public static final String EXPECTED_URL = "https://janko.humanity.com/app/staff/assignstaff&new=1&first=6090078/";

	public static void clickStaff (WebDriver driver) {
	driver.findElement(By.xpath(STAFF_XPATH)).click();
	}
	
	public static void clickAddEmployee (WebDriver driver) {
		driver.findElement(By.xpath(ADD_EMPLOYEE_XPATH)).click();
		}
	
	public static void inputEmployeeName (WebDriver driver, String name) {
		driver.findElement(By.xpath(EMPLOYEE_NAME)).sendKeys("no");
		}
	
	public static void inputEmployeeLastName (WebDriver driver, String surname) {
		driver.findElement(By.xpath(EMPLOYEE_LAST_NAME)).sendKeys("Name");
		}
	public static void inputEmployeeEmail (WebDriver driver, String email) {
		driver.findElement(By.xpath(EMPLOYEE_EMAIL)).sendKeys("whatever@gmail.com");
		
	}
	
	public static void clickSaveEmployee (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_EMPLOYEE)).click();
		}
	
	

}