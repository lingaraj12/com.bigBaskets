package com.google.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class removecartpage {
	@FindBy(xpath="//div[@class='item-remove']")
	private WebElement removecart;

	public WebElement getRemovecart() {
		return removecart;
	}

	public void setRemovecart(WebElement removecart) {
		this.removecart = removecart;
	}
}
