import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testRunnerTry.TestRunner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class TestOne {
    WebDriver driver = null;

    @BeforeMethod
    public void beforeMethod() {
        TestRunner runner = new TestRunner();
        driver = runner.runChrome();
    }

    @AfterMethod (alwaysRun = true)
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void testTry() {
        driver.get("https://www.leagueofgraphs.com/");
        WebElement HOMESCREANSEARCHBUTTON = driver.findElement(By.xpath("//div[@id='filtersMenuSearchForm']//button[@class='search_button']"));
        WebElement SEARCHFIELD = driver.findElement(By.xpath("//div[@id='filtersMenuSearchForm']//input[@name='wg_q']"));

        Assert.assertEquals(HOMESCREANSEARCHBUTTON.getText(), "Search");
        SEARCHFIELD.click();
        SEARCHFIELD.sendKeys("Altzen");
        driver.findElement(By.xpath("//div[@id='filtersMenuSearchForm']//button[@class='search_button']")).click();
        WebElement PAGEBANNER = driver.findElement(By.xpath("//div[@class='pageBanner img-align-block']//h2"));
        Assert.assertEquals(PAGEBANNER.getText(),"Search Results for \"Altzen\"");
        driver.findElement(By.xpath("//div[@class='txt']/a[@href='/summoner/ru/Altzen']")).click();
    }

    @Test
    public void selenideTry () {
        open("https://www.leagueofgraphs.com/");
        $(By.xpath("//div[@id='filtersMenuSearchForm']//button[@class='search_button']")).shouldBe(text("Search"));
        $(By.xpath("//div[@id='filtersMenuSearchForm']//input[@name='wg_q']")).sendKeys("Altzen");
        $(By.xpath("//div[@id='filtersMenuSearchForm']//button[@class='search_button']")).click();
        $(By.xpath("//div[@class='pageBanner img-align-block']//h2")).shouldHave(text("Search Results for \"Altzen\""));
        $(By.xpath("//div[@class='txt']/a[@href='/summoner/ru/Altzen']")).click();
    }
}