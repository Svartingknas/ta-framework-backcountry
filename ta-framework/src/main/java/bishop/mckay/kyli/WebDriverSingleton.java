package bishop.mckay.kyli;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSingleton {

	private static WebDriver driver;

		private WebDriverSingleton() {

	}

	public static WebDriver getWebDriver() {
		if(driver == null) {
					System.setProperty("webdriver.chrome.driver", "/home/kmckay-bishop/selenium/chromedriver/chromedriver");
					driver = new ChromeDriver(getChromeOptions());
			}
			return driver;
	}

	private static ChromeOptions getChromeOptions() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("chrome.switches", "--disable-extensions");
		chromeOptions.addArguments("chrome.switches", "--no-sandbox");
		chromeOptions.addArguments("chrome.switches", "--disable-infobars");

		Map<String, Object> chromePreferences = new HashMap<>();
		chromePreferences.put("credentials_enable_service", false);
		chromePreferences.put("profile.password_manager_enabled", false);
		chromeOptions.setExperimentalOption("prefs", chromePreferences);
		return chromeOptions;
	}
}
