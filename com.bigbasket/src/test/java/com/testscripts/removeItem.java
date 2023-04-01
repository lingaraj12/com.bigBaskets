package com.testscripts;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericmethod.baseclass;

public class removeItem extends baseclass{

@Test
public void remoceitemtest() {
	hp.getViewcart().click();

	try {	
	rcp.getRemovecart();}
catch(NoSuchElementException e) {
	System.out.println("item removed");
}
	Reporter.log("product removed succfully", true);
hp.getCart().click();
}
	
	
	
	
	
	
	
	
	
	
	
	
}
