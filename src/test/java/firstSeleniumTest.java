import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.slf4j.Logger;

public class firstSeleniumTest {
    WebDriver driver; // It is not a class but it is interface and purpose of it is to control the browser

    @BeforeClass
    public void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown(){
        //We have to close the window and for that we can ue two methods like .close and .quit. Close means we can close current window and .quit means it will quit all the windows.
       // driver.quit();
    }

    @Test
    public void testLoginIntoTheApplication() throws InterruptedException {
        Thread.sleep(2000);
        //Total there are 8 locators in Selenium
        //First step is to find the element and next is to do action on it.
        //There are three ways to find an element and the below is the first way
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("Admin");

        //Second way to find the element.
        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //Next is to click the button
        driver.findElement(By.tagName("button")).click();


    }
}
