package com.genericmethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.google.objectrepo.homepage;
import com.google.objectrepo.removecartpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	
	public static WebDriver driver;
public fileLib fl=new fileLib();
public String paths="environment.properties";
public homepage hp;
public removecartpage rcp;
public eventlist cu=new eventlist();
public  Retry retry=new Retry();
public ExtentHtmlReporter reporter;
public ExtentReports extent;

@BeforeTest
	public void configBT() throws IOException {
	reporter=new ExtentHtmlReporter("extent.html");	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	if(fl.getDataFromProperties(paths, "browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		/*}else {
			fl.getDataFromProperties(paths, "browser").equals("edge") ;
			WebDriverManager.edgedriver().setup();;
			WebDriver d=new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/
		}
		hp=PageFactory.initElements(driver, homepage.class);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
driver.get(fl.getDataFromProperties(paths,"url"));
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void test() {
		ExtentTest test=extent.createTest("my 1st test","sample descreption");
		test.log(Status.INFO, "this step shows usage of log(status,details)");
	test.info("this step shows usage of info(details)")	;
	test.fail("details");
		test.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public void configBT1() {
		driver.close();
		extent.flush();
	}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


