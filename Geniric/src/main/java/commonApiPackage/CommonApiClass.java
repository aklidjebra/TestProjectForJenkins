package commonApiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonApiClass {

    public static WebDriver driver=null;

    @Parameters({"platform","url","browser"})
    @BeforeMethod
    public static WebDriver setup(String platform,String url,String browser){
        System.setProperty("webdriver.chrome.driver","../Geniric/src/main/resources/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(url);



        return driver;
    }
@AfterMethod
    public void sleep() throws InterruptedException {

            Thread.sleep(3000);

    }

    @AfterMethod
    public void Quit() {
        driver.quit();
    }
}
