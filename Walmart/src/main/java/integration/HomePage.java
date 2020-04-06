package integration;

import basePackage.CommonAPIClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPIClass {

    @FindBy(xpath ="//img[@class='cog-logo']")
    WebElement cognizantsign;



    public void setCognizantsign(){
        if(cognizantsign.isDisplayed()){
            Assert.assertTrue(true);
            String title =driver.getTitle();
            Assert.assertEquals(title,"Digital Solutions to Advance Your Business | Cognizant");
            System.out.println(title);
        }
    }




}
