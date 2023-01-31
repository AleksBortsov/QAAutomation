package tests;


import google.ElementsGoogleSearchMainPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import youTube.ElementsYouTubeMainPage;

import java.io.File;
import java.util.List;

public class YouTubeAndGoogleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        File file = new File("src/test/resources/chromedriver109.0.5414.74.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
    }

    SoftAssert softAssert = new SoftAssert();


    @Test(priority = 0)
    public void youtubeTest() {


        driver.navigate().to(ElementsYouTubeMainPage.YOUTUBE_URL);
        driver.findElement(ElementsYouTubeMainPage.searchFieldMainXPage).isEnabled();

        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.searchFieldMainXPage).isEnabled(), "The searchFieldMainXPage not found");
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.mainTitleXPath).isEnabled(), "The mainTitleXPath not found");
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.searchFieldInMainTitleXPath).isEnabled(), "The searchFieldInMainTitleXPath not found");
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.searchFieldInMainTitleCSS).isEnabled(), "The searchFieldInMainTitleCSS not found");
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.searchIconInMainTitleXPath).isEnabled(), "The searchIconInMainTitleXPath not found");
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.searchIconInMainTitleCSS).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.homeIconLeftMenuInMainTitleXPath).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.shortsIconLeftMenuInMainTitleXPath).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.subscriptionsIconLeftMenuInMainTitleXPath).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.libraryIconLeftMenuInMainTitleXPath).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.histotyIconLeftMenuInMainTitleXPath).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.typeImageXPath).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.typeImageCSS).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.typeImage2CSS).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.listElementsShow).isEnabled());
        softAssert.assertTrue(driver.findElement(ElementsYouTubeMainPage.partilFindListElementsShow).isEnabled());
        softAssert.assertAll();
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='search-input']")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.cssSelector("[id='search-input']")).isEnabled());
//
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.cssSelector("[id='search-icon-legacy']")).isEnabled());
//
//        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Home']")).isEnabled());
//
//
//        Assert.assertTrue(driver.findElement(By.xpath("(//*[text()='Shorts'])[1]")).isEnabled());
//
//        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Subscriptions']")).isEnabled());
//
//        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Library']")).isEnabled());
//
//        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='History']")).isEnabled());
//
//
//        Assert.assertTrue(driver.findElement(By.cssSelector("[type='image/x-icon']")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@type='image/x-icon']")).isEnabled());
//
//        Assert.assertTrue(driver.findElement(By.cssSelector("[type='application/opensearchdescription+xml']")).isEnabled());

        List<WebElement> elementListInRirhtMenu = driver.findElements(ElementsYouTubeMainPage.listElementsShow);
        for (WebElement elementListIRM : elementListInRirhtMenu
        ) {
            System.out.println(elementListIRM.getText());
            System.out.println("----------------------------------------------");
        }
        List<WebElement> elementListInRirhtMenuPart = driver.findElements(ElementsYouTubeMainPage.partilFindListElementsShow);
        for (WebElement elementListIRM2 : elementListInRirhtMenuPart
        ) {
            System.out.println(elementListIRM2.getText());
            System.out.println("----------------------------------------------");
        }
        driver.quit();
    }

    @Test(priority = 1)
    public void googleChromeTest() {
        driver.navigate().to(ElementsGoogleSearchMainPage.GOOGLE_URL);
        softAssert.assertTrue(driver.findElement(ElementsGoogleSearchMainPage.searchFieldGoogle).isEnabled());
        driver.findElement(ElementsGoogleSearchMainPage.searchFieldGoogle).click();
        driver.findElement(ElementsGoogleSearchMainPage.searchFieldGoogle).sendKeys(ElementsGoogleSearchMainPage.SEARCH);
        driver.findElement(ElementsGoogleSearchMainPage.searchFieldGoogle).sendKeys(Keys.ENTER);

        List<WebElement> elementListInRirhtMenuPart = driver.findElements(ElementsGoogleSearchMainPage.firstFindFieldXPath);

        for (WebElement elementListIRM2 : elementListInRirhtMenuPart
        ) {
            if (elementListIRM2.getText().contains(ElementsGoogleSearchMainPage.findTextIn)) {

                System.out.println(elementListIRM2.getText());
                System.out.println("---------------------------------------------------------------------");
            }
            Assert.assertEquals(elementListIRM2.getText(), ElementsGoogleSearchMainPage.findTextIn, "The text was not found");
        }
        softAssert.assertAll();
        driver.quit();
    }
}
