package main.java.playwright;

public class TestUtil extends LaunchBrowser {

	    // This class provides utility methods for interacting with the Playwright Page object.
	    // It can be used to perform common actions like clicking, filling forms, navigating, etc.

	    // The Page object is passed in the constructor to allow interaction with the browser page.
	
	    public void click(String selector) {
	        page.click(selector);
	    }

	    public void fill(String selector, String value) {
	        page.fill(selector, value);
	    }

	    public void navigate(String url) {
	        page.navigate(url);
	    }

	    public String getText(String selector) {
	        return page.textContent(selector);
	    }

	    public boolean isVisible(String selector) {
	        return page.isVisible(selector);
	    }

	    public boolean isEnabled(String selector) {
	        return page.isEnabled(selector);
	    }

	    public void waitForSelector(String selector) {
	        page.waitForSelector(selector);
	    }

}
