package bishop.mckay.kyli;

import org.junit.jupiter.api.Test;

public class LoginTests extends BackcountryTest {

	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		loginPage.login();
	}

}
