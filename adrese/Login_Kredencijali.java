package adrese;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Kredencijali {
	
	public static final String LOGIN = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String EMAIL_USERNAME = "//*[@id=\"email\"]";
	public static final String PASSWORD_FIELD = "//*[@id=\"password\"]";
	public static final String PASSWORD = "qwerty123";
	public static final String USERNAME = "bilosta@gmail.com";
	public static final String SUCCESSFUL_LOGIN = "https://janko.humanity.com/app/dashboard/";



public static void clickLogin (WebDriver driver) {
	driver.findElement(By.xpath(LOGIN)).click();
	}

public static void inputKredencijali1 (WebDriver driver, String USERNAME) {
	driver.findElement(By.xpath(EMAIL_USERNAME)).sendKeys(USERNAME);	
	}

public static void inputKredencijali2 (WebDriver driver, String PASSWORD) {
	driver.findElement(By.xpath(PASSWORD_FIELD)).sendKeys(PASSWORD);
	}
}