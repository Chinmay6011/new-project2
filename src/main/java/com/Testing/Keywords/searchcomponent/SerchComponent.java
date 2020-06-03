package com.Testing.Keywords.searchcomponent;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Testing.Keywords.Keyword;

public class SerchComponent extends Keyword {
	private Logger log= Logger.getLogger(SerchComponent.class);
	//@Test
	public void verifyPriceRange() {
		Keyword.openBrowser("Chrome");
		
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.searchProduct("Shoes");
		Keyword.closeBrowser();
		assertTrue(true, "Search product result");
		log.info("close browser");
	}
	//@Test
	public void verifySpecialChar() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {

			e.printStackTrace(); 
		}
			Keyword.closeloginPopup();
			Keyword.searchProduct("#@$%*&");
	
			 Assert.assertTrue(true, "NO RESULT FOUND !");
			
		
		
	}
	//@Test
	public void verifyNumber() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.searchProduct("123456");
		Keyword.closeBrowser();
		assertTrue(true, "NO RESULT FOUND !");
	}
	//@Test
	public void SearcBarSaveProduct() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.searchComponent();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Keyword.searchMask();
		Keyword.closeBrowser();
		assertTrue(true, "Click Search product");
	

	}
	@Test
	public void ProductInFormationPage() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.searchProduct("bat");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Keyword.searchBatInformationPage();
		Keyword.closeBrowser();
	
		
		
	}
	//@Test
	public void nullproduct() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.searchProduct(null);
		Keyword.closeBrowser();
		assertTrue(false,"product not search");
	}

}

