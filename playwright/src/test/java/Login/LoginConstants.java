package Login;

import playwright.LaunchBrowser;

public class LoginConstants  extends LaunchBrowser {

	// URLs and credentials for the login page

	public static final String LOGIN_URL = prop.getProperty("url") + "practice-test-login/";
	public static final String USERNAME = "student";
	public static final String PASSWORD = "Password123";
	public static final String SUCCESS_URL = prop.getProperty("url") + "logged-in-successfully/";

}
