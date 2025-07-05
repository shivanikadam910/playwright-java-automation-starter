
package playwright;

public class TestUtil extends LaunchBrowser {

	// Utility class for Playwright interactions
	// This class is designed to provide reusable methods for common Playwright operations.
	// It can be extended or modified to include additional utility methods as needed.
	
	 // This class provides utility methods for interacting with the Playwright Page object.
    // It can be used to perform common actions like clicking, filling forms, navigating, etc.

    // The Page object is passed in the constructor to allow interaction with the browser page.

    public void click(String selector) {
        logger.info("Clicking element with selector: " + selector);
        page.click(selector);
    }

    public void fill(String selector, String value) {
        logger.info("Filling element '" + selector + "' with value: " + value);
        page.fill(selector, value);
    }

    public void navigate(String url) {
        logger.info("Navigating to URL: " + url);
        page.navigate(url);
    }

    public String getText(String selector) {
        logger.info("Getting text from selector: " + selector);
        return page.textContent(selector);
    }

    public boolean isVisible(String selector) {
        logger.info("Checking visibility for selector: " + selector);
        return page.isVisible(selector);
    }

    public boolean isEnabled(String selector) {
        logger.info("Checking if selector is enabled: " + selector);
        return page.isEnabled(selector);
    }

    public void waitForSelector(String selector) {
        logger.info("Waiting for selector: " + selector);
        page.waitForSelector(selector);
    }

}
