package Login;

import playwright.LaunchBrowser;

public class LoginConstants  extends LaunchBrowser {

	public static final String SUCCESS_MESSAGE_SELECTOR = ".woocommerce-message";

	// URLs and credentials for the login page

	public static final String LOGIN_URL = "https://practicetestautomation.com/practice-test-login/";
	public static final String USERNAME = "student";
	public static final String PASSWORD = "Password123";
	public static final String SUCCESS_URL = "https://practicetestautomation.com/logged-in-successfully/";

}
