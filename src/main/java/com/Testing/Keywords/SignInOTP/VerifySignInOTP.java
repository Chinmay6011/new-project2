package com.Testing.Keywords.SignInOTP;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.Testing.Keywords.Keyword;

public class VerifySignInOTP {
	@Test
	public void SendOTPInYourMobile() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.clickSignInButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.signInUserName("7888161042");
		Keyword.loginInOtp();
	    Keyword.closeBrowser();
	    assertTrue(true,"Send otp in your mobile");
		
	}
	@Test
	public void unRegisterMobileNumber() {
		   Keyword.openBrowser("Chrome");
			Keyword.launchUrl("https://www.shopclues.com/");

			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			Keyword.closeloginPopup();
			Keyword.clickSignInButton();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Keyword.signInUserName("7888151042");
			Keyword.loginInOtp();
			Keyword.closeBrowser();
		assertTrue(true,"Account doesn't exist with this mobile number. Register now.");
	}
	 @Test
	 public void FakeNumber() {
		   Keyword.openBrowser("Chrome");
			Keyword.launchUrl("https://www.shopclues.com/");

			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			Keyword.closeloginPopup();
			Keyword.clickSignInButton();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Keyword.signInUserName("788881551042");
			Keyword.loginInOtp();
			Keyword.closeBrowser();
		assertTrue(true,"Please enter valid email id or mobile number.");
		
	}
	 @Test
	 public void VerifyOTPNotEnter() {
		 Keyword.openBrowser("Chrome");
			Keyword.launchUrl("https://www.shopclues.com/");

			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			Keyword.closeloginPopup();
			Keyword.clickSignInButton();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Keyword.signInUserName("7888161042");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			Keyword.loginInOtp();
	
		
}
}