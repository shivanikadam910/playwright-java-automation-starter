package playwright;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import com.microsoft.playwright.*;

public class LaunchBrowser {

	public static Playwright playwright;
	public static Browser browser;
	public static BrowserContext context;
	public static Page page;
	public static final Logger logger = Logger.getLogger(""); // Initialize logger first
	public static Properties prop = initConfig(); // Now call initConfig()

	public static Page initBrowser() {
		logger.info("Initializing Playwright and launching browser");
		playwright = Playwright.create();

		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));

		context = browser.newContext();
		page = context.newPage();
		if (prop != null) {
			logger.info("Navigating to URL from config: " + prop.getProperty("url"));
			page.navigate(prop.getProperty("url"));
		} else {
			logger.severe("Properties not loaded. Skipping navigation.");
			System.err.println("Properties not loaded. Skipping navigation.");
		}
		page.navigate(prop.getProperty("url"));
		return page;
	}

	public static void terminateBrowser() {
		if (context != null)
			context.close();
		if (browser != null)
			browser.close();
		if (playwright != null)
			playwright.close();
	}

	public static Properties initConfig() {
		prop = new Properties();
		try (InputStream input = LaunchBrowser.class.getClassLoader().getResourceAsStream("config/config.properties")) {
			if (input == null) {
				logger.severe("Unable to find config/config.properties");
				System.err.println("Unable to find config/config.properties");
				return null;
			}
			prop.load(input);
			logger.info("Config properties loaded successfully");
		} catch (IOException e) {
			logger.severe("IOException while loading config: " + e.getMessage());
			System.err.println("IOException while loading config: " + e.getMessage());
			e.printStackTrace();
		}
		return prop;
	}

}
