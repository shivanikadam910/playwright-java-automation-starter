package Login;

import org.testng.Assert;
import org.testng.annotations.*;
public class LoginTest extends LoginConstants {

	LoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		logger.info("Setting up browser and LoginPage instance");
		page = initBrowser();
		loginPage = new LoginPage(page);
	}

	@Test
	public void testSuccessfulLogin() {
		logger.info("Starting test: testSuccessfulLogin");
		loginPage.navigate(LOGIN_URL);
		loginPage.login(USERNAME, PASSWORD);
		logger.info("Login attempted, verifying URL");
		Assert.assertEquals(loginPage.getCurrentUrl(), SUCCESS_URL, "Login failed or URL mismatch.");
		logger.info("Login test passed");
	}

	@AfterMethod
	public void tearDown() {
		logger.info("Tearing down browser");
		terminateBrowser();
	}

}