package ObejctRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 @FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
 private WebElement profileElement;
 
 @FindBy(xpath = "//a[text()='Sign Out']")
 private WebElement signoutlink;
 
 @FindBy(xpath = "//a[text()='Calendar']")
 private WebElement calendarlink;
 
 @FindBy(xpath=  "//a[@href='index.php?module=Leads&action=index']")
 private WebElement leadslink;
 
 @FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
 private WebElement orglink;
 
  //initialization
 public HomePage(WebDriver driver) {
	 PageFactory.initElements( driver,this);
 }
 
 public WebElement getCalendarlink() {
	return calendarlink;
 }

 public WebElement getLeadslink() {
	return leadslink;
 }

 public WebElement getOrglink() {
	return orglink;
 }

 public WebElement getprofilElement() {
	 return profileElement;
 }
 public WebElement getSignoutlink() {
	 return signoutlink;
 }
 //bussiness logic
 public void logout(WebDriver driver) {
	 HomePage hp=new HomePage(driver);
	 WebElement element=hp.getprofilElement();
	 Actions a=new Actions(driver);
	 a.moveToElement(element).perform();
	 hp.getSignoutlink().click();
 }
}
