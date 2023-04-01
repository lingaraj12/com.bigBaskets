package com.testscripts;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericmethod.Retry;
import com.genericmethod.baseclass;
import com.genericmethod.eventlist;
@Listeners(eventlist.class)
public class addtocart extends baseclass {
	@Test(retryAnalyzer=Retry.class)
	public void AddToCarttest() {
		hp.getHome().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hp.getBreast().click(); 
		//cu.waitForAlert(driver);
		//cu.acceptalert(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hp.getAddtocart().click();
	    hp.getViewcart().click();
		hp.getCart().click();
		Assert.assertTrue(false, "test case failed");
	}}
