package com.genericmethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class eventlist implements ITestListener{
	public void onTestFailure(ITestResult result) {
	File src=((TakesScreenshot)baseclass.driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("screenShot/;"+System.currentTimeMillis()+".png");
	try {
		FileUtils.copyFile(src, dest);
	}catch(IOException e) {
		e.printStackTrace();
	}}//select class
    public void selectByVisibleText(WebElement element, String text) {
	Select sel=new Select(element);
     sel.selectByVisibleText(text);
   }
	//actions class
   public void mouseaction(WebElement element) {
	Actions act= new Actions(driver);
	
	
	
	}
	
	
	}

  





	
	
	
	
	
	
	
	

