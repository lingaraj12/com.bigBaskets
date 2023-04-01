package com.google.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {

	@FindBy(xpath="//*[@id=\"store-entry\"]/div[1]/div/div[1]/div/div/a/img")
private WebElement home;

@FindBy(xpath="//a[text()='Farm Eggs - Regular, Medium, Antibiotic Residue-Free']")
private WebElement breast;

@FindBy(xpath="//span[text()='ADD TO BASKET']")
private WebElement addtocart;

@FindBy(xpath="//span[text()='My Basket']")
private WebElement viewcart;

@FindBy(xpath="//a[text()='View Basket & Checkout']")
private WebElement cart;



public WebElement getCart() {
	return cart;
}

public void setCart(WebElement cart) {
	this.cart = cart;
}

public WebElement getHome() {
	return home;
}

public void setHome(WebElement home) {
	this.home = home;
}



public WebElement getBreast() {
	return breast;
}

public void setBreast(WebElement breast) {
	this.breast = breast;
}

public WebElement getAddtocart() {
	return addtocart;
}

public void setAddtocart(WebElement addtocart) {
	this.addtocart = addtocart;
}

public WebElement getViewcart() {
	return viewcart;
}

public void setViewcart(WebElement viewcart) {
	this.viewcart = viewcart;
}












}
