package com.Testing.Keywords.HomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;


import com.Testing.Keywords.Keyword;

public class Login {
	// @BeforeClass
	public void Login() {
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

}
