package linkedinPakageTest;

import linkedPakage.LinkedinSetup;
import org.testng.annotations.Test;

import java.util.SimpleTimeZone;

public class LinkedinSetupTest extends LinkedinSetup {


    @Test (priority = 1)
    public void LinkedinTest () throws InterruptedException {

        LinkedinHomepage();
        Thread.sleep(3000);
        SigninButton();
        Thread.sleep(3000);
        username("asdfgl@ksksk");
        Thread.sleep(3000);
        passwodfield("12345");
        Thread.sleep(3000);
        signinButt();
        Thread.sleep(3000);





    }
    @Test (priority = 2)
    public void LinkedinTest2 () throws InterruptedException {

        LinkedinHomepage();
        Thread.sleep(3000);
        SigninButton();
        Thread.sleep(3000);
        username("dfsjsjdfjsdjf");
        Thread.sleep(3000);
        passwodfield("12345sadas");
        Thread.sleep(3000);
        signinButt();
        Thread.sleep(3000);





    }
    @Test (priority = 3)
    public void LinkedinTest3 () throws InterruptedException {

        LinkedinHomepage();
        Thread.sleep(3000);
        SigninButton();
        Thread.sleep(3000);
        username("dfsjsjdfjsdjfsds");
        Thread.sleep(3000);
        passwodfield("12345sadasda");
        Thread.sleep(3000);
        signinButt();
        Thread.sleep(3000);


    }

    }
