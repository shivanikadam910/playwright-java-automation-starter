package playwright;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class Sorting {
    private Playwright playwright;
    private Browser browser;
    private Page page;

    @BeforeClass
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @Test
    public void testSortableList() {
        page.navigate("https://www.globalsqa.com/demo-site/sorting/");
        page.frameLocator("iframe.demo-frame").locator("#sortable li").nth(0).dragTo(
            page.frameLocator("iframe.demo-frame").locator("#sortable li").nth(3)
        );
        // Add assertions as needed
    }

    @Test
    public void testSortableGrid() {
        page.navigate("https://www.globalsqa.com/demo-site/sorting/");
        page.locator("#tabs-2").click();
        page.frameLocator("iframe.demo-frame").locator("#sortable_grid li").nth(0).dragTo(
            page.frameLocator("iframe.demo-frame").locator("#sortable_grid li").nth(5)
        );
        // Add assertions as needed
    }

    @AfterClass
    public void tearDown() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
