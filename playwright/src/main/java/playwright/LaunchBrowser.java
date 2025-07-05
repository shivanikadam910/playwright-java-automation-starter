package playwright;

import com.microsoft.playwright.*;

public class LaunchBrowser {
	public Page page;
	public Page initBrowser() {
		// Initialize Playwright
		try (Playwright playwright = Playwright.create()) {

			// Launch a browser (e.g., Chromium)
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); 
			// Create a new browser context (acts like a fresh profile)
			BrowserContext context = browser.newContext();

			// Open a new page
			page = context.newPage();

			// Navigate to a URL
			page.navigate("https://www.saucedemo.com/");
		}
		return page;
	}

}
