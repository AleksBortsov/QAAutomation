package youTube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ElementsYouTubeMainPage {

    public ElementsYouTubeMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static final By searchFieldMainXPage = By.xpath("(//*[@id='search'])[3]");
    public static final By mainTitleXPath = By.xpath("//*[text()='Home']");

    public static final By searchFieldInMainTitleXPath = By.xpath("//*[@id='search-input']");
    public static final By searchFieldInMainTitleCSS = By.cssSelector("[id='search-input']");

    public static final By searchIconInMainTitleXPath = By.xpath("//*[@id='search-icon-legacy']");
    public static final By searchIconInMainTitleCSS = By.cssSelector("[id='search-icon-legacy']");

    public static final By homeIconLeftMenuInMainTitleXPath = By.xpath("//span[text()='Home']");

    public static final By shortsIconLeftMenuInMainTitleXPath = By.xpath("(//*[text()='Shorts'])[1]");

    public static final By subscriptionsIconLeftMenuInMainTitleXPath = By.xpath("//span[text()='Subscriptions']");

    public static final By libraryIconLeftMenuInMainTitleXPath = By.xpath("//span[text()='Library']");

    public static final By histotyIconLeftMenuInMainTitleXPath = By.xpath("//span[text()='History']");

    //elements to task
    public static final By typeImageXPath = By.xpath("//*[@type='image/x-icon']");
    public static final By typeImageCSS = By.cssSelector("[type='image/x-icon']");

    public static final By typeImage2CSS = By.cssSelector("[type='application/opensearchdescription+xml']");

    public static final By listElementsShow = By.xpath("//*[@id='video-title']");

    public static final By partilFindListElementsShow = By.partialLinkText("ап");


//    @FindBy(xpath = "//*[@class='gsfi ytd-searchbox']")
//    public static WebElement searchFieldMainXPageFindBy;

//    @FindBy(xpath = "//*[text()='Головна']")
//    public static WebElement mainTitleXPath;

//    @FindBy(xpath = "//*[@id='search-input']")
//    public static WebElement searchFieldInMainTitleXPath;
//    @FindBy(css = "[@id='search-input']")
//    public static WebElement searchFieldInMainTitleCSS;
//
//    @FindBy(xpath = "//*[@id='search-icon-legacy']")
//    public static WebElement searchIconInMainTitleXPath;
//    @FindBy(css = "[id='search-icon-legacy']")
//    public static WebElement searchIconInMainTitleCSS;
//
//    @FindBy(xpath = "//span[text()='Home']")
//    public static WebElement homeIconLeftMenuInMainTitleXPath;
//
//    @FindBy(xpath = "(//*[text()='Shorts'])[1]")
//    public static WebElement shortsIconLeftMenuInMainTitleXPath;
//
//    @FindBy(xpath = "//span[text()='Subscriptions']")
//    public static WebElement subscriptionsIconLeftMenuInMainTitleXPath;
//
//    @FindBy(xpath = "//span[text()='Library']")
//    public static WebElement libraryIconLeftMenuInMainTitleXPath;
//
//    @FindBy(xpath = "//span[text()='History']")
//    public static WebElement histotyIconLeftMenuInMainTitleXPath;

//    //elements to task
//    @FindBy(xpath = "//*[@type='image/x-icon']")
//    public static WebElement typeImageXPath;
//    @FindBy(css = "[type='image/x-icon']")
//    public static WebElement typeImageCSS;
//    @FindBy(css = "[type='application/opensearchdescription+xml']")
//    public static WebElement typeImage2CSS;
//
//    @FindBy(xpath = "//*[@id='video-title']")
//    public static WebElement listElementsShow;
//
//    @FindBy(partialLinkText = "ап")
//    public static WebElement partilFindListElementsShow;


    public static String YOUTUBE_URL = "https://www.youtube.com/";

}
