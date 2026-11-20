package com.crm.Vtiger.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Seleniumutility {
public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}
public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}

public void navToApp(WebDriver driver,String url) {
	driver.get(url);
}
public void closeBrowser(WebDriver driver) {
	driver.quit();
}
public void selectOptionfromDropdownByContainsText(WebElement address,String Text) {
	Select s=new Select(address);
	s.selectByContainsVisibleText(Text);
}
}
