package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='txtUsername']")
	@CacheLookup
	WebElement txtUsername;

	@FindBy(xpath = "//input[@id='txtPassword']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='btnLogin']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	@CacheLookup
	WebElement imgLogo;

	public void launchURL(String URL) {
		ldriver.get(URL);
		ldriver.manage().window().maximize();
	}

	public void enterUsername(String user) {
		txtUsername.sendKeys(user);
	}

	public void enterPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
		System.out.println(imgLogo.isDisplayed());
	}

}
