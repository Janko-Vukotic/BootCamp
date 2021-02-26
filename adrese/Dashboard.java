package adrese;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	
	public static final String URL_DASHBOARD = "https://janko.humanity.com/app/dashboard/";
	public static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	public static final String SHIFT_PLANNING_XPATH = "//*[@id=\"sn_schedule\"]/span/p";
	public static final String URL_SHIFT = "https://janko.humanity.com/app/schedule/employee/week/overview/overview/26%2c1%2c2021/";
	public static final String TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span/p";
	public static final String URL_TIME = "https://janko.humanity.com/app/timeclock/";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span/p";
	public static final String URL_LEAVE = "https://janko.humanity.com/app/requests/vacation/";
	public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span/p";
	public static final String URL_TRAINING = "https://janko.humanity.com/app/training/";
	public static final String URL_STAFF = "https://janko.humanity.com/app/staff/list/load/true/";
	public static final String URL_AVAILABILITY = "https://janko.humanity.com/fe/availability/";
	public static final String URL_PAYROLL = "https://janko.humanity.com/app/payroll/?path=payroll";
	public static final String URL_REPORTS = "https://janko.humanity.com/app/reports/dashboard/";
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span/p";
	public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span/p";
	public static final String PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]/span/p";
	public static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span/p";

public static void clickDashboard (WebDriver driver) {
	driver.findElement(By.xpath(DASHBOARD_XPATH)).click();
	
	}

public static void clickShift (WebDriver driver) {
	driver.findElement(By.xpath(SHIFT_PLANNING_XPATH)).click();
	}

public static void clickClock (WebDriver driver) {
	driver.findElement(By.xpath(TIME_CLOCK_XPATH)).click();
	}

public static void clickLeave (WebDriver driver) {
	driver.findElement(By.xpath(LEAVE_XPATH)).click();
	}

public static void clickTraining (WebDriver driver) {
	driver.findElement(By.xpath(TRAINING_XPATH)).click();
	}

public static void clickStaff (WebDriver driver) {
	driver.findElement(By.xpath(STAFF_XPATH)).click();
	}

public static void clickAvailability (WebDriver driver) {
	driver.findElement(By.xpath(AVAILABILITY_XPATH)).click();
	}

public static void clickPayroll (WebDriver driver) {
	driver.findElement(By.xpath(PAYROLL_XPATH)).click();
	}

public static void clickReports (WebDriver driver) {
	driver.findElement(By.xpath(REPORTS_XPATH)).click();
	}

}