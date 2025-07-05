package main.java.playwright;
import com.microsoft.playwright.*;

public class LaunchBrowser {

    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    public static final String URL = "https://practicetestautomation.com/";

    public static Page initBrowser() {
        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome")
        );

        context = browser.newContext();
        page = context.newPage();
        page.navigate(URL);

        return page;
    }

    public static void terminateBrowser() {
        if (context != null) context.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
