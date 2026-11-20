package com.crm.Vtiger.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import ObejctRepository.HomePage;
import ObejctRepository.loginpage;

public class Baseclass {
	public static WebDriver driver;
	FileUtility f=new FileUtility();
	Seleniumutility sutil=new Seleniumutility(); 
	
	@BeforeSuite
		public void ConnecttoDatabase() {
		Reporter.log("database connected successfully",true);
		
		}
	@Parameters("browser")
@BeforeTest
public void launchBrowser(String BROWSER) throws IOException {
	if(BROWSER.equals("chrome")) {
		driver=new ChromeDriver();
	}else if(BROWSER.equals("firefox")) {
		driver=new FirefoxDriver();
	}else if(BROWSER.equals("edge")) {
		driver=new EdgeDriver();
	}else {
		driver=new ChromeDriver();
	}
	
	
	sutil.maximizeWindow(driver);
	sutil.implicitWait(driver);
	String URL=f.readDataFromProperty("url");
	sutil.navToApp(driver, URL);
	Reporter.log("launched browser and nav to vtiger",true);
	
}
@BeforeMethod
public void loginTovtiger() throws IOException {
	loginpage lp = new loginpage(driver);
	String un = f.readDataFromProperty("username");
	String pw = f.readDataFromProperty("password");
	lp.LoginToVtiger(driver, un, pw);
	Reporter.log("logged in successfully",true);
}


@AfterMethod
public void logutfromvtiger() {
	 HomePage hp=new HomePage(driver);
	 hp.logout(driver);
     Reporter.log("logged out successfully",true);
}

@AfterTest
public void closeBrowser() {
	sutil.closeBrowser(driver);
	Reporter.log("browser closed successfully",true);
}
@AfterSuite
public void disconnetwithdatabase() {
	Reporter.log("database disconnected",true);
}
}


