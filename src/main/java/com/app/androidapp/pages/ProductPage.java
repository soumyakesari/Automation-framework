package com.app.androidapp.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductPage {
	
	AndroidDriver driver;
	@AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
	private MobileElement ProductTitle;
	
	public ProductPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	public String getTitleOfProduct() {
		
		return ProductTitle.getText();
	}
	
	

}
