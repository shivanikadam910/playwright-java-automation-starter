package test.java.login;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends LoginConstants {
	LoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		page = initBrowser();
		loginPage = new LoginPage(page);
	}

	@Test
	public void testSuccessfulLogin() {
		loginPage.navigate(LOGIN_URL);
		loginPage.login(USERNAME, PASSWORD);
		Assert.assertEquals(loginPage.getCurrentUrl(), SUCCESS_URL, "Login failed or URL mismatch.");
	}

	@AfterMethod
	public void tearDown() {
		terminateBrowser();
	}
}
