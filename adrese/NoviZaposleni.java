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
	public static final String KEYS1 = "No";
	public static final String KEYS2 = "Name";
	public static final String KEYS3 = "whatever@gmail.com";
	
	

	public static void clickStaff (WebDriver driver) {
	driver.findElement(By.xpath(STAFF_XPATH)).click();
	}
	
	public static void clickAddEmployee (WebDriver driver) {
		driver.findElement(By.xpath(ADD_EMPLOYEE_XPATH)).click();
		}
	
	public static void inputEmployeeName (WebDriver driver, String name) {
		driver.findElement(By.xpath(EMPLOYEE_NAME)).sendKeys(KEYS1);
		}
	
	public static void inputEmployeeLastName (WebDriver driver, String surname) {
		driver.findElement(By.xpath(EMPLOYEE_LAST_NAME)).sendKeys(KEYS2);
		}
	public static void inputEmployeeEmail (WebDriver driver, String email) {
		driver.findElement(By.xpath(EMPLOYEE_EMAIL)).sendKeys(KEYS3);
		
	}
	
	public static void clickSaveEmployee (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_EMPLOYEE)).click();
		}

	public static String getStaffXpath() {
		return STAFF_XPATH;
	}

	public static String getAddEmployeeXpath() {
		return ADD_EMPLOYEE_XPATH;
	}

	public static String getEmployeeName() {
		return EMPLOYEE_NAME;
	}

	public static String getEmployeeLastName() {
		return EMPLOYEE_LAST_NAME;
	}

	public static String getEmployeeEmail() {
		return EMPLOYEE_EMAIL;
	}

	public static String getSaveEmployee() {
		return SAVE_EMPLOYEE;
	}

	public static String getExpectedUrl() {
		return EXPECTED_URL;
	}

	public static String getKeys1() {
		return KEYS1;
	}

	public static String getKeys2() {
		return KEYS2;
	}

	public static String getKeys3() {
		return KEYS3;
	}
	
	
	

}