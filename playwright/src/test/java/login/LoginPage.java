package test.java.login;

import com.microsoft.playwright.Page;

public class LoginPage extends LoginConstants {
	
	public final String usernameSelector = "#username";
	public final String passwordSelector = "#password";
	public final String loginButtonSelector = "#submit";

	public LoginPage(Page page) {
		this.page = page;
		// TODO Auto-generated constructor stub
	}

	// Actions
	public void navigate(String url) {
		page.navigate(url);
	}

	public void enterUsername(String username) {
		page.fill(usernameSelector, username);
	}

	public void enterPassword(String password) {
		page.fill(passwordSelector, password);
	}

	public void clickLogin() {
		page.click(loginButtonSelector);
	}

	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}

	public String getCurrentUrl() {
		return page.url();
	}

}
