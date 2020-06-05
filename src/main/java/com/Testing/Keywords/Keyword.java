package com.Testing.Keywords;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.Testing.CustomUtils.PropertiesUtils;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword extends Constant{
	protected static WebDriver driver;
	private static Logger log=Logger.getLogger(Keyword.class);
	public static void openBrowser(String BrowserName) {
		switch(BrowserName){
		case"Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case"Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case"IE":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		case"HtmlUnit":
			driver=new HtmlUnitDriver();
			break;
			default:
				System.out.println("Browser not found");
				break;
			
		}
		wait= new FluentWait(driver);
		log.info(BrowserName+"is opend Successfully");
	}
	public static void launchUrl(String url) {
		driver.get(url);
		log.info("Launched the url: "+url);
	}
	public static void navigate(String url) {
		driver.navigate().to(url);
		
	}
	public static WebElement getWebElement(String locator) {
		String locatorType=PropertiesUtils.getLocatorValue(locator)[0];
		String locatorValue=PropertiesUtils.getLocatorValue(locator)[1];
		WebElement element=null;
		switch(locatorType) {
		case "xpath":
			element=driver.findElement(By.xpath(locatorValue));
			break;
		case "css":
			element=driver.findElement(By.cssSelector(locatorValue));
			break;
		case "id":
			element=driver.findElement(By.id(locatorValue));
			break;
		case "class":
			element=driver.findElement(By.className(locatorValue));
			break;
		case "linktext":
			element=driver.findElement(By.linkText(locatorValue));
			break;
		case "partiallinktext":
			element=driver.findElement(By.partialLinkText(locatorValue));
			break;
			
			
			default:
				break;
		}
		return element;
		
	}
	public static void performclick(String locator) {
		String locatorType=PropertiesUtils.getLocatorValue(locator)[0];
		String locatorValue=PropertiesUtils.getLocatorValue(locator)[1];
		getWebElement(locatorValue).click();
		
		
		

	}
	public static void enterText1(String locator,String keyValue) {
		String locatorType=PropertiesUtils.getLocatorValue(locator)[0];
		String locatorValue=PropertiesUtils.getLocatorValue(locator)[1];
		getWebElement(locatorValue).sendKeys("keyValue");

	}
	
	public static void searchProduct(String productName) {
		getWebElement("searchComponent").sendKeys(productName);
	 
		getWebElement("magnifier").click();
		log.info("Search product: "+productName);
	}
	public static void signInUserName(String userName) {
		getWebElement("signInUserName").sendKeys(userName);
	}
	public static void signInPassWord(String passWord) {
		getWebElement("signInPassWord").sendKeys(passWord);
	}
	public static void clickloginButton() {
		getWebElement("clickloginButton").click();
	}
	public static void facebokLoginButton() {
		getWebElement("facebokLoginButton").click();
	}
	public static void facebokUserName(String userName) {
		getWebElement("facebokUserName").sendKeys(userName);
	}
	public static void facebokPassWord(String passWord) {
		getWebElement("facebokPassWord").sendKeys(passWord);
	}
	public static void facebokLogin() {
		getWebElement("facebokLogin").click();
	}
	public static void loginInOtp() {
		getWebElement("loginInOtp").click();
	}
	public static void clickLogo() {
		getWebElement("clickLogo").click();
	}
	public static void mouseHaverLogo() {
		WebElement logo= getWebElement("clickLogo");
		Actions action= new Actions(driver);
		action.moveToElement(logo).perform();
	}  	
	public static void mouseHaverNotificationButton() {
		WebElement notification= getWebElement("notificationButton");
		Actions action= new Actions(driver);
		action.moveToElement(notification).perform();
	}
	public static void clickNotificationButton() {
		getWebElement("notificationButton").click();
	}
	public static void clickShareLocationButton() {
		getWebElement("shareLocationButton").click();
	}
	public static void enterPincode(String pincode) {
		getWebElement("enterPincode").sendKeys(pincode);
	}
	public static void submitPinCodePopup(){
		getWebElement("submitPinCodePopup").click();
	}
	public static void ClickWishlistButton() {
		getWebElement("clickWishlistButton").click();
	} 
	public static void removeToWishlist() {
		getWebElement("removeToWishlist").click();
	}
	public static void addToCartFromWishlist() {
		getWebElement("addToCartFromWishlist").click();	
	}
	public static void clickDailyEssentials() {
		getWebElement("DailyEssentials").click();
	} 
	public static void addProductWishlist() {
		getWebElement("AddProductWishlist").click();

		
	


	
	 
	
	
	}
	public static void searchComponent() {
		getWebElement("searchComponent").click();
	}
	public static void searchMask() {
		getWebElement("searchMask").click();
	}
	public static void clickSignInButton() {
		getWebElement("clickSignInButton").click();
	}
	
	public static void closeloginPopup() {
		getWebElement("popupCloseButton").click();
	
		log.info("Popup is closed");
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void clickOn(String element) {
		getWebElement(element).click();
	}
	public static void clickOn(WebElement element) {
		element.click();
	}
	public static void enterText(String element, String text) {
		getWebElement(element).sendKeys(text);
	}
	public static String getText(String locator) {
		return getWebElement(locator).getText();
	}
	public static void waitFor(long duration) {
	
		wait.withTimeout(duration, TimeUnit.MILLISECONDS);
	}
	public static void minWait() {
		wait.withTimeout(3, TimeUnit.SECONDS);
	}
	public static void moderateWait() {
		wait.withTimeout(5, TimeUnit.SECONDS);
	}
	public static void maxWait() {
		wait.withTimeout(30, TimeUnit.SECONDS);
	}
	public static void waitForVisibilityOfelement(String locator) {
       wait.withTimeout(5, TimeUnit.SECONDS);
       wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));
	}public static void searchBatInformationPage() {
		getWebElement("searchBatInformationPage").click();
	}
}
