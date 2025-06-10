package org.test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertTrue;
public class WebPageTest {
    static WebDriver driver;
    @BeforeTest
    public void openBrowser()throws InterruptedException{
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://jssateb.ac.in");
    }
    @Test
    public void titleValidationTest() {
        String actualTitle=driver.getTitle();
        String expected="JSSATE";
        Assert.assertEquals(actualTitle,expected);
        Assert.assertTrue(true,"title should contain jssate");
    }
    @AfterTest
    public void closeBrowser() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }
}