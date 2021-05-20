package nop_commerce;

/*
*Homework -1
Navigate to google https://www.google.com/
In Goole search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to Computers page.
Navigate to google https://www.google.com/
In Google search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.

*
 */


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Nop_Commerce {

    WebDriver driver;
    @Before
    public void set_Up(){
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Google Homepage
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[text()='I agree']")).click();

    }
    @Test
    public void verify_User_on_Nop_Commerce_Page(){
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("https://demo.nopcommerce.com");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).submit();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[1]")).click();
        String expectedErrorMessage = "Computers";
        // confirm the user on computer page.
        WebElement erromessage = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualErrormessage = erromessage.getText();
        Assert.assertEquals("User is not on a computer page", expectedErrorMessage, actualErrormessage);

    }
    @Test
    public void verify_user_on_Electronic_Page(){
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("https://demo.nopcommerce.com");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).submit();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]")).click();
        String expectedErrorMessage = "Electronics";
        // confirm the user on computer page.
        WebElement erromessage = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualErrormessage = erromessage.getText();
        Assert.assertEquals("User is not on a electronics page", expectedErrorMessage, actualErrormessage);

    }
    @Test
    public void verify_user_on_Appreal_Page(){
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("https://demo.nopcommerce.com");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).submit();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]")).click();
        String expectedErrorMessage = "Apparel";
        // confirm the user on computer page.
        WebElement erromessage = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualErrormessage = erromessage.getText();
        Assert.assertEquals("User is not on a Apparel page", expectedErrorMessage, actualErrormessage);

    }
    @Test
    public void Digital_downloads(){
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("https://demo.nopcommerce.com");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).submit();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]")).click();
        String expectedErrorMessage = "Digital downloads";
        // confirm the user on computer page.
        WebElement erromessage = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualErrormessage = erromessage.getText();
        Assert.assertEquals("User is not on a Digital downloads page", expectedErrorMessage, actualErrormessage);

    }
    @Test
    public void Books(){
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("https://demo.nopcommerce.com");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).submit();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]")).click();
        String expectedErrorMessage = "Books";
        // confirm the user on computer page.
        WebElement erromessage = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualErrormessage = erromessage.getText();
        Assert.assertEquals("User is not on a Books page", expectedErrorMessage, actualErrormessage);

    }
    @Test
    public void verifyUserOnJewelry(){
        // type the URL in Search bar
        driver.findElement(By.name("q")).sendKeys("https://demo.nopcommerce.com");
        // submit the search
        driver.findElement(By.xpath("//input[@class='gNO89b'or@value='Google Search']")).submit();
        // click the link
        driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
        // click the link
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[6]/a")).click();
        // Digital downloads tab
        String expectedErrorMessage = "Jewelry";
        // confirm the user on computer page.
        WebElement erromessage = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualErrormessage = erromessage.getText();
        Assert.assertEquals("error msg not display", expectedErrorMessage, actualErrormessage);

    }
    @Test // j unit
    public void verifyUserOnGiftCard(){
        // type the URL in Search bar
        driver.findElement(By.name("q")).sendKeys("https://demo.nopcommerce.com");
        // submit the search
        driver.findElement(By.xpath("//input[@class='gNO89b'or@value='Google Search']")).submit();
        // click the link
        driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
        // click the link
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[7]/a")).click();
        // Digital downloads tab
        String expectedErrorMessage = "Gift Cards";
        // confirm the user on computer page.
        WebElement erromessage = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualErrormessage = erromessage.getText();
        Assert.assertEquals("error msg not display", expectedErrorMessage, actualErrormessage);

    }
    // after block
    @After // j unit after
    public void tearDown() {

        driver.quit();
    }




}

