package com.flipkart.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps {
	
	static WebDriver driver;
	
	@Given("User launch flipkart application")
	public void user_launch_flipkart_application() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   }

	@Given("user abel to login flipkart credentials")
	public void user_abel_to_login_flipkart_credentials() {
		System.out.println("login");
		try {
        WebElement log = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    log.isDisplayed();
	    log.click();
		}catch (Exception e) {
			System.out.println("login not required");
		}
	    
	}

	@When("user search mobile and choose")
	public void user_search_mobile_and_choose() {
		System.out.println("search");
		driver.findElement(By.name("q")).sendKeys("Realme",Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(@class,'_4rR01T')])[2]"));
		mobileName.click();
	}

	@When("user add mobile to add to cart")
	public void user_add_mobile_to_add_to_cart() {
		Set<String> id = driver.getWindowHandles();
		List<String> child = new ArrayList<>(id);
		driver.switchTo().window(child.get(1));
		
		
		
	}

	@Then("user validates confirmation message")
	public void user_validates_confirmation_message() {
		WebElement buy = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA ihZ75k _3AWRsL')]"));
		WebElement spec = driver.findElement(By.xpath("//div[contains(text(),'Specifications')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", spec);
		String text = buy.getText();
		
        Assert.assertTrue(buy.isDisplayed());
		
		Assert.assertEquals("BUY NOW", text);
		driver.quit();
		
	}
	
	@When("user search mobile and choose by one dim list")
	public void user_search_mobile_and_choose_by_one_dim_list(DataTable dataTable) {
	   List<String> asList = dataTable.asList();
	   
		driver.findElement(By.name("q")).sendKeys(asList.get(0),Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+asList.get(0)+"')])[2]"));
		String pd = mobileName.getText();
		System.out.println("mobile name is :"+pd);
		mobileName.click();
	}

	@When("user search mobile and choose by one dim map")
	public void user_search_mobile_and_choose_by_one_dim_map(DataTable dataTable) {
	    Map<String, String> asMap = dataTable.asMap(String.class, String.class);
	   
		driver.findElement(By.name("q")).sendKeys(asMap.get("phone3"),Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+asMap.get("phone3")+"')])[2]"));
		String pd = mobileName.getText();
		System.out.println("mobile name is :"+pd);
		mobileName.click();
	}
	
	@When("user search mobile and choose by {string}")
	public void user_search_mobile_and_choose_by(String name) {
		
		driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]"));
		String pd = mobileName.getText();
		System.out.println("mobile name is :"+pd);
		mobileName.click();
		
	}
	


}
