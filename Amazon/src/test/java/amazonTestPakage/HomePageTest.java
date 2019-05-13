package amazonTestPakage;

import amazonPackage.HomePageSetup;
import org.testng.annotations.Test;


public class HomePageTest extends HomePageSetup{


    @Test
    public void Amazonpage() throws InterruptedException {

        OpenAmazonPage();
        Thread.sleep(3000);
        ClickAccount();
        Thread.sleep(3000);
        Inputusername("akli@aaaa");
        Thread.sleep(3000);
        Inputpass("password11");
        Thread.sleep(3000);
        Signinbut();
        Thread.sleep(3000);

    }




}
