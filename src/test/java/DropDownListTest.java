import PageObject.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownListTest extends PreSetUp {



    @Test
    public void ClickTest() {
        MainPage objMainPage = new MainPage(webDriver);
        objMainPage.CookieAcceptance();
        objMainPage.FirstButtonClick();
        FaqAnswers objFaqAnswers = new FaqAnswers();
        assertEquals(objFaqAnswers.answers[0], objMainPage.GetFirstButtonText());
        objMainPage.SecondButtonClick();
        assertEquals(objFaqAnswers.answers[1], objMainPage.GetSecondButtonText());
        objMainPage.ThirdButtonClick();
        assertEquals(objFaqAnswers.answers[2], objMainPage.GetThirdButtonText());
        objMainPage.FourthButtonClick();
        assertEquals(objFaqAnswers.answers[3], objMainPage.GetFourthButtonText());
        objMainPage.FifthButtonClick();
        assertEquals(objFaqAnswers.answers[4], objMainPage.GetFifthButtonText());
        objMainPage.SixthButtonClick();
        assertEquals(objFaqAnswers.answers[5], objMainPage.GetSixthButtonText());
        objMainPage.SeventhButtonClick();
        assertEquals(objFaqAnswers.answers[6], objMainPage.GetSeventhButtonText());
        objMainPage.EighthButtonClick();
        assertEquals(objFaqAnswers.answers[7], objMainPage.GetEighthButtonText());

    }



    }
