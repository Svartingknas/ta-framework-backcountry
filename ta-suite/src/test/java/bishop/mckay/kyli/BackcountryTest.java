package bishop.mckay.kyli;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class BackcountryTest {

	@BeforeEach
	public void setup() {
		WebDriverSingleton.getWebDriver().get("https://www.backcountry.com/");
	}

	@AfterEach
	public void cleanup() {
		WebDriverSingleton.getWebDriver().quit();
	}

}
