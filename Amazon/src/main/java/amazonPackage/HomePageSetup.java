package amazonPackage;

import commonApiPackage.CommonApiClass;
import org.openqa.selenium.By;

import java.sql.SQLOutput;

public class HomePageSetup extends CommonApiClass {

    public void OpenAmazonPage(){

        System.out.println(driver.getTitle());
    }
    public void ClickAccount(){
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();

    }
    public void Inputusername(String Email){

        driver.findElement(By.id("ap_email")).sendKeys(Email);
    }
    public void Inputpass (String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }
    public void Signinbut(){
        driver.findElement(By.className("a-button-input")).click();
    }



}
