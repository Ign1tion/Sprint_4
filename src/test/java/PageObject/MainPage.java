package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class MainPage {
    private WebDriver driver;
    //Кнопка "Заказать" шапки главной страницы
    private By headerOrderButton = (By. xpath(".//button[@class='Button_Button__ra12g']"));
    //Кнопка "Заказать" тела главной страницы
    private By bodyOrderButton = (By. xpath(".//div[@class='Home_FinishButton__1_cWm']/button"));
    //Кнопка "Статус заказа"
    private By orderStatusButton = (By. xpath("//button[@class = 'Header_Link__1TAG7']"));
    //Поле ввода "статус заказа"
    private By orderStatusInput = (By.xpath(".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']"));
    //Кнопка "Go!"
    private By goButton = (By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']"));
    //Первая вкладка выпадающего списка
    private By firstButton = (By.xpath(".//div[text()='Сколько это стоит? И как оплатить?']"));
    //текст первой вкладки выпадающего списка
    private By firstButtonText = (By.xpath(".//*[@id='accordion__panel-0']/p"));
    //Вторая вкладка выпадающего списка
    private By secondButton = (By.xpath(".//div[text()='Хочу сразу несколько самокатов! Так можно?']"));
    //Текст второй вкладки выпадающего списка
    private By secondButtonText = (By.xpath(".//*[@id='accordion__panel-1']/p"));
    //Третья вкладка выпадающего списка
    private By thirdButton = (By.xpath(".//div[text()='Как рассчитывается время аренды?']"));
    //Текст третей вкладки выпадающего списка
    private By thirdButtonText = (By.xpath(".//*[@id='accordion__panel-2']/p"));
    //Четвертая вкладка выпадающего списка
    private By fourthButton = (By.xpath(".//div[text()='Можно ли заказать самокат прямо на сегодня?']"));
    //Текст четвертой вкладки выпадающего списка
    private By fourthButtonText = (By.xpath(".//*[@id='accordion__panel-3']/p"));
    //Пятая вкладка выпадающего списка
    private By fifthButton = (By.xpath(".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']"));
    //Текст пятой вкладки выпадающего списка
    private By fifthButtonText = (By.xpath(".//*[@id='accordion__panel-4']/p"));
    //Шестая вкладка выпадающего списка
    private By sixthButton = (By.xpath(".//div[text()='Вы привозите зарядку вместе с самокатом?']"));
    //Текст шестой вкладки выпадающего списка
    private By sixthButtonText = (By.xpath(".//*[@id='accordion__panel-5']/p"));
    //Седьмая вкладка выпадающего списка
    private By seventhButton = (By.xpath(".//div[text()='Можно ли отменить заказ?']"));
    //Текст седьмой вкладки выпадающего списка
    private By seventhButtonText = (By.xpath(".//*[@id='accordion__panel-6']/p"));
    //Восьмая вкладка выпадающего списка
    private By eighthButton = (By.xpath(".//div[text()='Я жизу за МКАДом, привезёте?']"));
    //Текст восьмой вкладки выпадающего списка
    private By eightButtonText = (By.xpath(".//*[@id='accordion__panel-7']/p"));
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void CookieAcceptance(){ //Метод для принятия куки
        driver.findElement(By.id("rcc-confirm-button")).click();
    }
    //Клик по кнопке "Заказать" в шапке главной страницы
    public void HeaderOrderButtonClick(){
    driver.findElement(headerOrderButton).click();
    }
    //Клик по кнопке "Заказать" в теле главной страницы
    public void BodyOrderButtonClick(){
        driver.findElement(bodyOrderButton).click();}
    //клик по кнопке "статус заказа"
    public void CheckStatusClick(){
        driver.findElement(orderStatusButton).click();
    }
    //Метод для ввода номера заказа
    public void InputOrderNumber(String orderNumber){
        driver.findElement(orderStatusInput).sendKeys(orderNumber);
    }
    //клик по кнопке "Go!"
    public void GoButtonClick(){
        driver.findElement(goButton).click();
    }
    //Клик по первой вкладке выпадающего списка
    public void FirstButtonClick(){
        driver.findElement(firstButton).click();
    }
    //клик по второй вкладке выпадающего списка
    public void SecondButtonClick(){
        driver.findElement(secondButton).click();
    }
    //клик по третей вкладке выпадающего списка
    public void ThirdButtonClick() {
        driver.findElement(thirdButton).click();
    }
    //клик по четвертой вкладке выпадающего списка
        public void FourthButtonClick() {
            driver.findElement(fourthButton).click();
        }
    //клик по пятой вкладке выпадающего списка
    public void FifthButtonClick(){
        driver.findElement(fifthButton).click();
    }
    //клик по шестой вкладке выпадающего списка
    public void SixthButtonClick(){
        driver.findElement(sixthButton).click();
    }
    //клик по седьмой вкладке выпадающего списка
    public void SeventhButtonClick(){
        driver.findElement(seventhButton).click();
    }
    //клик по восьмой вкладке выпадающего списка
    public void EighthButtonClick(){
        driver.findElement(eighthButton).click();
    }
    //Изьятие текста из первой вкладки выпадающего списка
    public String GetFirstButtonText() {
        return driver.findElement(firstButtonText).getText();
    }
    //Изьятие текста из второй вкладки выпадающего списка
    public String GetSecondButtonText() {
        return driver.findElement(secondButtonText).getText();
    }
    //Изьятие текста из третей вкладки выпадающего списка
    public String GetThirdButtonText() {
        return driver.findElement(thirdButtonText).getText();
    }
    //Изьятие текста из четвертой вкладки выпадающего списка
    public String GetFourthButtonText() {
        return driver.findElement(fourthButtonText).getText();
    }
    //Изьятие текста из пятой вкладки выпадающего списка
    public String GetFifthButtonText() {
        return driver.findElement(fifthButtonText).getText();
    }
    //Изьятие текста из шестой вкладки выпадающего списка
    public String GetSixthButtonText() {
        return driver.findElement(sixthButtonText).getText();
    }
    //Изьятие текста из седьмой вкладки выпадающего списка
    public String GetSeventhButtonText() {
        return driver.findElement(seventhButtonText).getText();
    }
    //Изьятие текста из восьмой вкладки выпадающего списка
    public String GetEighthButtonText() {
        return driver.findElement(eightButtonText).getText();
    }
    public void OrderButtonClick(String button){                //input "head" for header order button or "body" for body order button;
        if(button.equals("head")){
            HeaderOrderButtonClick();
        }else if(button.equals("body")){
            BodyOrderButtonClick();
        }else HeaderOrderButtonClick();
    }
}
