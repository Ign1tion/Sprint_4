import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PreSetUp {
WebDriver webDriver;
    @Before
    public void setUp(){
        webDriver = BrowserSelectionMethod.get("firefox"); // input "firefox" or "chrome";
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void Clean(){
        webDriver.quit();
    }
}
