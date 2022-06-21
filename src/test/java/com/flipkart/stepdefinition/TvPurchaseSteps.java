package com.flipkart.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.objectrepository.TvPurchasePage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TvPurchaseSteps {
	
	Commonactions c = new Commonactions();
	TvPurchasePage t = new TvPurchasePage();

	@When("user search Tv and choose")
	public void user_search_Tv_and_choose() {
		System.out.println("search");
		//MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys("SAMSUNG TV",Keys.ENTER);
		c.insertText(t.getSearch(),"SAMSUNG");
		//WebElement mobileName = MobilePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'SAMSUNG')])[2]"));
		t.getMobileName().click();
	}

	@When("user add Tv to add to cart")
	public void user_add_Tv_to_add_to_cart() {
		c.windowsHandling();
		}
	
	@When("user search Tv and choose by one dim list")
	public void user_search_Tv_and_choose_by_one_dim_list(DataTable dataTable) {
	   List<String> asList = dataTable.asList();
	   String listname = asList.get(0);
	   String[] listname1 = listname.split(" ");
	   c.insertText(t.getSearch(), listname);
	   //MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys(listname,Keys.ENTER);
		WebElement mobileName = MobilePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'"+listname1[0]+"')])[2]"));
		String pd = mobileName.getText();
		System.out.println("Tv name is :"+pd);
		mobileName.click();
	}

	@When("user search Tv and choose by one dim map")
	public void user_search_Tv_and_choose_by_one_dim_map(DataTable dataTable) {
	    Map<String, String> asMap = dataTable.asMap(String.class, String.class);
	    String mapname = asMap.get("phone3");
	    String[] mapname1 = mapname.split(" ");
	    c.insertText(t.getSearch(), mapname);
	   // MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys(mapname,Keys.ENTER);
		WebElement mobileName = MobilePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'"+mapname1[0]+"')])[2]"));
		String pd = mobileName.getText();
		System.out.println("Tv name is :"+pd);
		mobileName.click();
	}
	
	@When("user search Tv and choose by {string}")
	public void user_search_Tv_and_choose_by(String name) {
		
		String[] name2 = name.split(" ");
		c.insertText(t.getSearch(), name);
		//MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
		WebElement mobileName = MobilePurchaseSteps.driver.findElement(By.xpath("(//div[contains(text(),'"+name2[0]+"')])[2]"));
		String pd = mobileName.getText();
		System.out.println("Tv name is :"+pd);
		mobileName.click();
		
	}
	

	
}
