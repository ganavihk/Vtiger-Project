package ObejctRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//declaration
	
	@FindBy(name="user_name")
	private WebElement usertbx;
	
	@FindBy(name="user_password")
	private WebElement pwtbx;
	
	@FindBy(id="submitButton")
	private WebElement lgbtn;
	
	//initialization
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getUsertbx() {
		return usertbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}	
	
	//Business Logic
	public void LoginToVtiger(WebDriver driver,String un,String pw) {
		loginpage lp = new loginpage(driver);
		lp.getUsertbx().sendKeys(un);
		lp.getPwtbx().sendKeys(pw);
		lp.getLgbtn().click();
	}
	
}

	


