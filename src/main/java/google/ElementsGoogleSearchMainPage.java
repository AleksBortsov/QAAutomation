package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ElementsGoogleSearchMainPage {

    public ElementsGoogleSearchMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static String GOOGLE_URL = "https://www.google.com.ua/";
    public static String SEARCH = "selenium webdriver";

    public static final By searchFieldGoogle = By.cssSelector("[class='gLFyf']");
    public static final By firstFindFieldXPath = By.cssSelector("[class='uEierd']");
    public static final By findText = By.partialLinkText("selenium");
    public static final String findTextIn = "selenium";

}
