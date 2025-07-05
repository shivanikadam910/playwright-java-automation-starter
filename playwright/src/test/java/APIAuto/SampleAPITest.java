package APIAuto;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class SampleAPITest {

    @Test
    public void testGetRequest() {
        try (Playwright playwright = Playwright.create()) {
            APIRequestContext requestContext = playwright.request().newContext();

            APIResponse response = requestContext.get("https://jsonplaceholder.typicode.com/posts/1");

            int status = response.status();
            String body = response.text();

            System.out.println("Status Code: " + status);
            System.out.println("Body: " + body);

            assert status == 200;
            assert body.contains("userId");
        }
    }
}
