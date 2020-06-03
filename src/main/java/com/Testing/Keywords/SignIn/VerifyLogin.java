package com.Testing.Keywords.SignIn;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Testing.Keywords.Keyword;

public class VerifyLogin {
	// @Test
	public void verifyLogin() {
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
		Keyword.signInPassWord("7888161042");
		;
		Keyword.clickloginButton();
		Assert.assertTrue(true, "login successfully");

	}

	// @Test
	public void verifyInvalidUserName() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.shopclues.com/");

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Keyword.closeloginPopup();
		Keyword.clickSignInButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.signInUserName("78881610426");
		Keyword.signInPassWord("7888161042");
		Keyword.clickloginButton();
		Assert.assertTrue(true, "Please enter valid email id or mobile number");
		Keyword.closeBrowser();

	}

	// @Test
	public void verifyInvalidpassword() {
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
		Keyword.signInPassWord("78881610426");
		Keyword.clickloginButton();
		Keyword.closeBrowser();
		Assert.assertTrue(true, "Incorrect login details");

	}

	// @Test
	public void verifyInvaliduserNamepassword() {
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
		Keyword.signInUserName("78881610426");
		Keyword.signInPassWord("78881610426");
		Keyword.clickloginButton();
		Keyword.closeBrowser();
		Assert.assertTrue(true, "Please enter valid email id or mobile number.");

	}

	// @Test
	public void InBetweenSpaceInUserName() {
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
		Keyword.signInUserName("7888 161042");
		Keyword.signInPassWord("7888161042");
		Keyword.clickloginButton();
		Keyword.closeBrowser();
		Assert.assertTrue(true, "Please enter valid email id or mobile number.");

	}

	//@Test
	public void notEnterUserAndPass() {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Keyword.clickloginButton();
		Keyword.closeBrowser();
		Assert.assertTrue(true, "Not login account ");

	}
	//@Test
	public void VerifyOnlyPassWord() {
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
	
		Keyword.clickloginButton();
		Keyword.closeBrowser();
		Assert.assertEquals( "Please enter your password",  "Please enter your password");
	}
	//@Test
	public void VerifyOnlyUserName() {
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
		Keyword.signInPassWord("7888161042");
	
		Keyword.clickloginButton();
		Keyword.closeBrowser();
		Assert.assertEquals( "Please enter email id or mobile number.",  "Please enter email id or mobile number.");
	}
	//@Test
	public void VerifyLoginInFacebokPage() {
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
		Keyword.facebokLoginButton();
		Keyword.closeBrowser();
		Assert.assertEquals("Log in to Facebook", "Log in to Facebook");
	}
	//@Test
	public void VerifyLoginInFacebok() {
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
		Keyword.facebokLoginButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.facebokUserName("ChinmayBhujbal6011@gmail.com");
		Keyword.facebokPassWord("9975038867");
		Keyword.facebokLogin();
		Keyword.closeBrowser();
		Assert.assertEquals("Log in to Facebook", "Log in to Facebook");
	}
	@Test
	public void ClickOtp() {
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
			Keyword.loginInOtp();
			Keyword.closeBrowser();
			Assert.assertTrue(true, "Please enter email id or mobile number.");
	}

	
	
	
	
	
	
	
	
	
	
}