package com.app.androidapp.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.app.android.lib.ExcelLibrary;
import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralStorePage 
{
	AndroidDriver driver;
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private MobileElement  Username;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement  LetsShopBt;

	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private MobileElement toastMsg;

	public GeneralStorePage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void tapOnLetsShopButton() throws IOException, InterruptedException
	{
		MobileActionUtil.tapOnElement(LetsShopBt, driver);

	}

	public String insertUsername()
	{
	    ExcelLibrary data = new ExcelLibrary();
	    String FName1 = data.getDataFromExcel("UserName", 0, 0);
		Username.sendKeys(FName1);
		return FName1;
        
	}

}




