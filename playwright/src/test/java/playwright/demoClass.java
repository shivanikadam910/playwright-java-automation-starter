package playwright;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

public class demoClass {
	public Page page;
	
	@Test
	public void test1() {
		LaunchBrowser launch = new LaunchBrowser();
		page = launch.initBrowser();
		
	}

}
