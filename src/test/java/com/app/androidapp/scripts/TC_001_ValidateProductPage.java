package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.android.lib.ExcelLibrary;
import com.app.android.lib.GenericLibrary;
import com.app.androidapp.init.GlobalVariables;
import com.app.androidapp.pages.GeneralStorePage;
import com.app.androidapp.pages.ProductPage;
import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;

public class TC_001_ValidateProductPage extends BaseLib
{
	
	@Test
	public void tc_001_ValidateProduct() throws IOException, InterruptedException {
		
	
	GeneralStorePage gsp = new GeneralStorePage (gv.driver);
	ProductPage pG = new ProductPage(gv.driver);
	gsp.insertUsername();
	
	//Tapping on Lets shop button
	gsp.tapOnLetsShopButton();
	
	//Validating the product page
	Assert.assertEquals(pG.getTitleOfProduct(),"Products");
	
	
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
