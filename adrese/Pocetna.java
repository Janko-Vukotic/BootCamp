package adrese;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


public class Pocetna {

	public static final String URL = "https://www.humanity.com/"; 
	public static final String URL_AFTER = "https://www.humanity.com/wizard-setup2/";
	public static final String URL_ABOUT = "https://www.humanity.com/about"; 
	public static final String POP_UP_X = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String ACCEPT_COOKIES = "//button[@data-cf-action='accept']";
	public static final String FULL_NAME = "//input[@name='fullname']";
	public static final String WORK_EMAIL = "//input[@name='workemail']";
	public static final String FULL_NAME_2 = "//*[@id=\"popup-form\"]/div[1]/input";
	public static final String WORK_EMAIL_2= "//*[@id=\"popup-form\"]/div[2]/input";
	public static final String START_FIRST_WAY = "//input[@id='free-trial-link-01']";
	public static final String START2_SECOND_WAY = "//*[@id=\"popup-free-trial-link\"]";
	public static final String START1_SECOND_WAY = "//a[@class='button pale']";
	public static final String SS_DESTINATION = "C:\\Users\\Janko\\Desktop\\screenshots\\slika.jpg";

	public static void clickX (WebDriver driver) {
		driver.findElement(By.xpath(POP_UP_X)).click();
		}
	
	public static void acceptCookies (WebDriver driver) {
		driver.findElement(By.xpath(ACCEPT_COOKIES)).click();
		}
	
	public static void inputFullName (WebDriver driver, String fullName) {
		driver.findElement(By.xpath(FULL_NAME)).sendKeys(fullName);
		}
	
	public static void inputWorkEmail (WebDriver driver, String workEmail) {
		driver.findElement(By.xpath(WORK_EMAIL)).sendKeys(workEmail);
		}
	
	public static void inputFullName2 (WebDriver driver, String fullName) {
		driver.findElement(By.xpath(FULL_NAME_2)).sendKeys(fullName);
		}
	
	public static void inputWorkEmail2 (WebDriver driver, String workEmail) {
		driver.findElement(By.xpath(WORK_EMAIL_2)).sendKeys(workEmail);
		}
	
	
	public static void clickStartForFirstWay (WebDriver driver) {
		driver.findElement(By.xpath(START_FIRST_WAY)).click();
		}
	
	public static void clickStart1ForSecondWay (WebDriver driver) {
		driver.findElement(By.xpath(START1_SECOND_WAY)).click();
		}
	
	public static void clickStart2ForSecondWay (WebDriver driver) {
		driver.findElement(By.xpath(START2_SECOND_WAY)).click();
		}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
		
}
