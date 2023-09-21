import PageObject.MainPage;
import PageObject.OrderPage;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.CoreMatchers.containsString;


@RunWith(Parameterized.class)
public class OrderTest extends PreSetUp {
private final String orderButton;
private final String firstName;
private final String secondName;
private final String adress;
private final String metroStation;
private final String phoneNumber;
private final String date;
private final int rentTime;
private final String color;
private final String courierComment;
public OrderTest(String orderButton, String firstName, String secondName, String adress, String metroStation, String phoneNumber, String date, int rentTime, String color, String courierComment){
    this.orderButton = orderButton;
    this.firstName = firstName;
    this.secondName = secondName;
    this.adress = adress;
    this.metroStation = metroStation;
    this.phoneNumber = phoneNumber;
    this.date = date;
    this.rentTime = rentTime;
    this.color = color;
    this.courierComment = courierComment;
}
@Parameterized.Parameters
public static Object[][] getTestData() {
    return new Object[][] {
            {"head", "Петя", "Пяточкин", "Сосновая 5к1", "Котельники", "96899999991", "01", 1, "black", "не звонить"},
            {"body", "Иван", "Иванов", "Фасадная 8к6", "Киевская", "12321312311", "31", 7, "grey", "звонить в любое время"}
    };
}      //look for browser selection in PreSetUp class
    @Test
    public void OrderTest() {
        OrderPage objOrderPage = new OrderPage(webDriver);
        MainPage objMainPage = new MainPage(webDriver);
        objMainPage.CookieAcceptance();
        objMainPage.OrderButtonClick(orderButton);
        objOrderPage.FirstNameInput(firstName);
        objOrderPage.SecondNameInput(secondName);
        objOrderPage.AdressInput(adress);
        objOrderPage.MetroStationButtonClick();
        objOrderPage.MetroStationSelect(metroStation);
        objOrderPage.PhoneNumberInput(phoneNumber);
        objOrderPage.NextButtonClick();
        objOrderPage.DateSelect(date);
        objOrderPage.RentTimeSelect(rentTime);
        objOrderPage.SelectScooterColor(color);
        objOrderPage.CourierCommentFiledInput(courierComment);
        objOrderPage.OrderButtonClick();
        objOrderPage.OrderConfirmationButtonClick();
        MatcherAssert.assertThat(objOrderPage.GetOrderInformation(), containsString("Заказ оформлен"));
    }


}
