package com.Testing.Keywords.HomePage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.Testing.Keywords.Keyword;

 //@Test
public class ShareLocationButton {
	public void VerifyPincode() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.clickShareLocationButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Keyword.enterPincode("410505");
		Keyword.submitPinCodePopup();
		assertTrue(true, "pincode enter succesfully");
		Keyword.closeBrowser();

	}
	//@Test
	public void fakepincode() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.clickShareLocationButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.enterPincode("123456");
		Keyword.submitPinCodePopup();
		assertTrue(true, "invalid pincode");
		Keyword.closeBrowser();
		
	}
	//@Test
	public void lessThanSixNoPincode() {
			Keyword.openBrowser("Chrome");
			Keyword.launchUrl("https://www.shopclues.com/");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Keyword.closeloginPopup();
			Keyword.clickShareLocationButton();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Keyword.enterPincode("41050");
			Keyword.submitPinCodePopup();
			assertTrue(true, "invalid pincode");
			Keyword.closeBrowser();
		
	}
	//@Test
	public void moreThanSixNoPincode() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.clickShareLocationButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.enterPincode("1234567");
		Keyword.submitPinCodePopup();
		assertTrue(true, "7th not accept");
		Keyword.closeBrowser();
		
	}
	//@Test
	public void specialCharInPincode() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.clickShareLocationButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.enterPincode("@#$%^&");
		Keyword.submitPinCodePopup();
		assertTrue(true,"Spacial char not enter");
		Keyword.closeBrowser();
	
		
	}
	//@Test
	public void CharInPincode() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.clickShareLocationButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.enterPincode("Chinmay");
		Keyword.submitPinCodePopup();
		assertTrue(true,"char not enter");
		
	}
	@Test
   public void NotEnterPincode() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.clickShareLocationButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.submitPinCodePopup();
		assertTrue(true,"please enter Pincode");
	   
   }

}
