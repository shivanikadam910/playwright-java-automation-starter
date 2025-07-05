package Login;

import com.microsoft.playwright.Page;

import playwright.LaunchBrowser;
import playwright.TestUtil;

public class LoginPage extends LoginConstants {
	
	TestUtil util = new TestUtil();

	public LoginPage(Page page) {
		LoginPage.page = page;
		logger.info("LoginPage initialized");
		// TODO Auto-generated constructor stub
	}
	// Actions
	public void navigate(String url) {
		logger.info("Navigating to URL: " + url);
		page.navigate(url);
	}

	public void login(String username, String password) {
		logger.info("Attempting login with username: " + username);
		util.fill(usernameSelector, username);
		util.fill(passwordSelector, password);
		util.click(loginButtonSelector);
		logger.info("Login button clicked");
	}

	public String getCurrentUrl() {
		String currentUrl = page.url();
		logger.info("Current URL: " + currentUrl);
		return currentUrl;
	}

}