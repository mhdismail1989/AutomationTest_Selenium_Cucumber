package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("^User Launch browser$")
	public void user_Launch_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
	}

	@When("^User opens the URL \"([^\"]*)\"$")
	public void user_opens_the_URL(String arg1) throws Throwable {
		lp.launchURL(arg1);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		lp.enterUsername(arg1);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		lp.enterPassword(arg1);
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		lp.clickLogin();
	}

	@Then("^I verify whether login is successful\\.$")
	public void i_verify_whether_login_is_successful() throws Throwable {
		if (driver.findElements(By.xpath("//img[@alt='OrangeHRM']")).size() > 0)
			System.out.println("Login successful");
		else
			System.out.println("Login unsuccessful");
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

}
