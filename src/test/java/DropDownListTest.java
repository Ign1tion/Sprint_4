import PageObject.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownListTest {

    @Test
    public void ClickTest() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.CookieAcceptance();
        objMainPage.FirstButtonClick();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", objMainPage.GetFirstButtonText());
        objMainPage.SecondButtonClick();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", objMainPage.GetSecondButtonText());
        objMainPage.ThirdButtonClick();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", objMainPage.GetThirdButtonText());
        objMainPage.FourthButtonClick();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", objMainPage.GetFourthButtonText());
        objMainPage.FifthButtonClick();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", objMainPage.GetFifthButtonText());
        objMainPage.SixthButtonClick();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", objMainPage.GetSixthButtonText());
        objMainPage.SeventhButtonClick();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", objMainPage.GetSeventhButtonText());
        objMainPage.EighthButtonClick();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", objMainPage.GetEighthButtonText());
        driver.quit();
    }
    }
