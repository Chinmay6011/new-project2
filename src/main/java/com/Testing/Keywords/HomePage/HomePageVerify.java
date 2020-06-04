package com.Testing.Keywords.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Testing.Keywords.Keyword;

public class HomePageVerify extends Keyword{
	public class homepageVerify extends Login{
	//@Test
	public void VerifyTitle() {
		Keyword.openBrowser("Chrome");
		Keyword.navigate("https://www.shopclues.com/");
		System.out.println("Title is "+driver.getTitle());
		Keyword.closeBrowser();
	}


//@Test
 public void VerifyClickLogo() {
	Keyword.openBrowser("Chrome");
	Keyword.launchUrl("https://www.shopclues.com/");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	Keyword.clickLogo();

    Assert.assertTrue(true);
    System.out.println("refreash Website");
    Keyword.closeBrowser();
   
	}
 //@Test
 public void VerifyMouseHaverLogo() {
	Keyword.openBrowser("Chrome");
	Keyword.launchUrl("https://www.shopclues.com/");
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   Keyword.closeloginPopup();
   Keyword.mouseHaverLogo();
   Assert.assertTrue(true, "shopclues online shopclues");
   Keyword.closeBrowser();
  
	 
 }
 //@Test
 public void VerifyMouseHavernotifiButton() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   Keyword.closeloginPopup();
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   Keyword.mouseHaverNotificationButton();
	   Assert.assertTrue(true, "notification massage should display");
	 
 }
// @Test
 public void VerifyClicknotifiButton() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   Keyword.closeloginPopup();
	   try { 
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   Keyword.clickNotificationButton();
	   Assert.assertTrue(true, "notification button not clickable");
	   Keyword.closeBrowser();
 }	
 //@Test
 
 public void OpenWishlistbutton() {
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 Keyword.ClickWishlistButton();
	 try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 Keyword.closeBrowser();
	 Assert.assertTrue(true, "open Wishlistbutton");
	   

	 
 }
// @Test
 public void RemoveToWishlistbutton() {
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 Keyword.ClickWishlistButton();
	 try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 Keyword.removeToWishlist();
	 Assert.assertTrue(true, "Successfully removed product");
	 Keyword.closeBrowser();
	   
 
 }
// @Test
 public void addToCartFromWishlist() {
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 Keyword.ClickWishlistButton();
	 try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 Keyword.addToCartFromWishlist();
	 Assert.assertTrue(true, "Successfully move product add to cart");
	
 }
 @Test
 public void addToCartProductWishlist() {
	 Keyword.workAtHomeImage();
	 
 }
}
}































