package playwright;

import org.testng.annotations.*;

public class Sorting extends LaunchBrowser {
 

    @BeforeClass
    public void setUp() {
       page = initBrowser();
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
