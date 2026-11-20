package ObejctRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organaizationpage {
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	@FindBy(xpath="//td[text()='Email ']/following-sibling::td/child::input")
	private WebElement emailaddress;
	
	@FindBy(name="rating")
	private WebElement ratingaddress;
	
	@FindBy(name="industry")
	private WebElement industrydrop;
	
	@FindBy(name="accounttype")
	private WebElement typedrop;
	
	@FindBy(name="bill_street")
	private WebElement billingaddress;
	
	@FindBy(name="ship_street")
	private WebElement shippingaddress;
	
	@FindBy(name="bill_city")
	private WebElement billcityaddress;
	
	@FindBy(name="ship_city")
	private WebElement shipcityaddress;
	
	@FindBy(name="bill_state")
	private WebElement billstate;
	
	@FindBy(name="ship_state")
	private WebElement shipstate;
	
	@FindBy(name="bill_country")
	private WebElement billcountry;
	
	@FindBy(name="ship_country")
	private WebElement shipcountry;
	
	@FindBy(name="description")
	private WebElement desp;
	
	@FindBy(name="button")
	private WebElement save;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement cancel;
	


public WebElement getPlusicon() {
		return plusicon;
}
public WebElement getOrgname() {
	return orgname;
}
public WebElement getEmailaddress() {
	return emailaddress;
}
public WebElement getRatingaddress() {
	return ratingaddress;
}
public WebElement getIndustrydrop() {
	return industrydrop;
}
public WebElement getTypedrop() {
	return typedrop;
}
public WebElement getBillingaddress() {
	return billingaddress;
}
public WebElement getShippingaddress() {
	return shippingaddress;
}
public WebElement getBillcityaddress() {
	return billcityaddress;
}
public WebElement getShipcityaddress() {
	return shipcityaddress;
}
public WebElement getBillstate() {
	return billstate;
}
public WebElement getShipstate() {
	return shipstate;
}
public WebElement getBillcountry() {
	return billcountry;
}
public WebElement getShipcountry() {
	return shipcountry;
}
public WebElement getDesp() {
	return desp;
}
public WebElement getSave() {
	return save;
}
public WebElement getCancel() {
	return cancel;
}
//initialization
	public Organaizationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

