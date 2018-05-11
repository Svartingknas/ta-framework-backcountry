package bishop.mckay.kyli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver webDriver;

	@FindBy(linkText = "My Account")
	private WebElement myAccountLink;

	@FindBy(id = "modal-login")
	private WebElement emailField;

	@FindBy(id = "modal-password")
	private WebElement passwordField;

	public void login() {
		PageFactory.initElements(WebDriverSingleton.getWebDriver(), this);
		myAccountLink.click();
		emailField.sendKeys("kyli.nmb@gmail.com");
		passwordField.sendKeys("1161Help@");
	}
}
