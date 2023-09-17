import PageObject.MainPage;
import PageObject.OrderPage;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.containsString;



public class OrderTest {
    @Test
    public void FirefoxOrderTest() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderPage objOrderPage = new OrderPage(driver);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.HeaderOrderButtonClick(); //оформление заказа с шапки главной страницы
        objOrderPage.FirstNameInput("Петя");
        objOrderPage.SecondNameInput("Пяточкин");
        objOrderPage.AdressInput("Сосновая 5к1");
        objOrderPage.MetroStationButtonClick();
        objOrderPage.MetroStationSelect("Котельники");
        objOrderPage.PhoneNumberInput("96899999991");
        objOrderPage.NextButtonClick();
        objOrderPage.DateSelect("01"); // 01-30
        objOrderPage.RentTimeSelect(7); // 1-7
        objOrderPage.SelectScooterColor("black"); //"black or "grey"
        objOrderPage.CourierCommentFiledInput("не звонить");
        objOrderPage.OrderButtonClick();
        objOrderPage.OrderConfirmationButtonClick();
        MatcherAssert.assertThat(objOrderPage.GetOrderInformation(), containsString("Заказ оформлен"));
        System.out.println(objOrderPage.GetOrderInformation());
        driver.quit();
    }

    @Test
    public void ChromeOrderTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderPage objOrderPage = new OrderPage(driver);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.CookieAcceptance();
        objMainPage.BodyOrderButtonClick(); //оформление заказа с тела главной страницы
        objOrderPage.FirstNameInput("Иван");
        objOrderPage.SecondNameInput("Иванов");
        objOrderPage.AdressInput("Фасадная 8к6");
        objOrderPage.MetroStationButtonClick();
        objOrderPage.MetroStationSelect("Киевская");
        objOrderPage.PhoneNumberInput("12321312311");
        objOrderPage.NextButtonClick();
        objOrderPage.DateSelect("31");
        objOrderPage.RentTimeSelect(1);
        objOrderPage.SelectScooterColor("grey");
        objOrderPage.CourierCommentFiledInput("звонить в любое время");
        objOrderPage.OrderButtonClick();
        objOrderPage.OrderConfirmationButtonClick();
        MatcherAssert.assertThat(objOrderPage.GetOrderInformation(), containsString("Заказ оформлен"));
        System.out.println(objOrderPage.GetOrderInformation());
        driver.quit();
    }
}
