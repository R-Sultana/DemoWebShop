package demoIbjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {

	// find elements in the webpage and store it in a variable
	@FindBy(id="Email")
	private WebElement emailEdt;
	
	@FindBy(id="Password")
	private WebElement passwordEdt;
	
	@FindBy(className="login-button")
	private WebElement loginBtn;
	
	//create a constructor for the loginpage
	
	public DemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//provides getter methods to access the webelements
	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
}
