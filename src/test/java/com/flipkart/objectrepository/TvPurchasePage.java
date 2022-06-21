package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class TvPurchasePage extends Commonactions{
	
	public TvPurchasePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeIcon;
	

	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="((//div[contains(text(),'SAMSUNG')])[2]")
	private WebElement mobileName;
	
	@FindBy(xpath="//button[contains(@class,'_2KpZ6l _2U9uOA ihZ75k _3AWRsL')]")
	private WebElement buy;
	
	@FindBy(xpath="//div[contains(text(),'Specifications')]")
	private WebElement spec;

	public WebElement getCloseIcon() {
		return closeIcon;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getMobileName() {
		return mobileName;
	}

	public WebElement getBuy() {
		return buy;
	}

	public WebElement getSpec() {
		return spec;
	}

}
