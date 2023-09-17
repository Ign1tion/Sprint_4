package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class OrderPage {
    private WebDriver driver;
    private By firstNameField = (By.cssSelector("[placeholder='* Имя']"));
    private By secondNameField = (By.cssSelector("[placeholder='* Фамилия']"));
    private By adressField = (By.cssSelector("[placeholder='* Адрес: куда привезти заказ']"));
    private By metroStationButton = (By.xpath(".//div[@class='select-search']"));
    private By phoneNumberField = (By.cssSelector("[placeholder='* Телефон: на него позвонит курьер']"));
    private By nextButton = (By.xpath(".//div[@class= 'Order_NextButton__1_rCA']/button"));
    private By dateField = (By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']"));
    private By rentTimeButton = (By.xpath(".//div[@class='Dropdown-root']"));
    private By oneDayRentButton = (By.xpath(".//div[contains(text(), 'сутки')]"));
    private By twoDaysRentButton = (By.xpath(".//div[contains(text(), 'двое суток')]"));
    private By threeDaysRentButton = (By.xpath(".//div[contains(text(), 'трое суток')]"));
    private By fourDaysRentButton = (By.xpath(".//div[contains(text(), 'четверо суток')]"));
    private By fiveDaysRentButton = (By.xpath(".//div[contains(text(), 'пятеро суток')]"));
    private By sixDaysRentButton = (By.xpath(".//div[contains(text(), 'шестеро суток')]"));
    private By sevenDaysRentButton = (By.xpath(".//div[contains(text(), 'семеро суток')]"));
    private By blackScooterCheckbox = (By.xpath(".//input[@id='black']"));
    private By greyScooterCheckbox = (By.xpath(".//input[@id='grey']"));
    private By courierCommentField = (By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']"));
    private By orderButton = (By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
    private By orderConfirmationButton = (By.xpath(".//div[@class='Order_Modal__YZ-d3']//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));
    private By orderCreatedWindow = (By.xpath(".//div[@class='Order_Modal__YZ-d3']"));
    private By orderInformationText = (By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']"));
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void FirstNameInput(String input){

        driver.findElement(firstNameField).sendKeys(input);

    }
    public void SecondNameInput(String input){
        driver.findElement(secondNameField).sendKeys(input);
    }
    public void AdressInput(String input){
        driver.findElement(adressField).sendKeys(input);
    }
    public void MetroStationButtonClick(){
        driver.findElement(metroStationButton).click();
    }
    public void MetroStationSelect(String input){
      driver.findElement(By.xpath(".//div[text() = '" + input + "']")).click();
    }
    public void PhoneNumberInput(String input){
        driver.findElement(phoneNumberField).sendKeys(input);
    }
    public void NextButtonClick(){
        driver.findElement(nextButton).click();
    }
    public void DateSelect(String input){
        driver.findElement(dateField).click();
        driver.findElement(By.xpath(".//div[contains(@class, 'day--0" + input + "')]")).click();
    }
    public void RentTimeSelect(int DayCount) {
        driver.findElement(rentTimeButton).click();
        if (DayCount == 1) {
            driver.findElement(oneDayRentButton).click();
        } else if (DayCount == 2) {
            driver.findElement(twoDaysRentButton).click();
        } else if (DayCount == 3) {
            driver.findElement(threeDaysRentButton).click();
        } else if (DayCount == 4) {
            driver.findElement(fourDaysRentButton).click();
        } else if (DayCount == 5) {
            driver.findElement(fiveDaysRentButton).click();
        } else if (DayCount == 6) {
            driver.findElement(sixDaysRentButton).click();
        } else if (DayCount == 7){
            driver.findElement(sevenDaysRentButton).click();
        }else Assert.fail("incorrect rent time");
    }
    public void SelectScooterColor(String input){
    driver.findElement(By.xpath(".//input[contains(@id, '"+input+"')]")).click();
    }
    public void CourierCommentFiledInput(String input){
        driver.findElement(courierCommentField).sendKeys(input);
    }
    public void OrderButtonClick(){
        driver.findElement(orderButton).click();
    }
    public void OrderConfirmationButtonClick(){
        driver.findElement(orderConfirmationButton).click();
    }

    public String GetOrderInformation(){
        String orderText = (driver.findElement(orderInformationText).getText());
        return orderText;
    }
    //добавить оставшиеся локаторы элементов (комментарий для курьера и далее) и методы для них.
}