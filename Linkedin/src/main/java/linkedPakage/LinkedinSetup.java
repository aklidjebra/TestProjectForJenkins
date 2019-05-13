package linkedPakage;

import commonApiPackage.CommonApiClass;
import org.openqa.selenium.By;

public class LinkedinSetup extends CommonApiClass {


    public void LinkedinHomepage (){


        System.out.println(driver.getTitle());
    }
    public void SigninButton (){
         driver.findElement(By.className("nav__button-secondary")).click();
    }
    public void  username(String email){
        driver.findElement(By.id("username")).sendKeys(email);


    }

    public void  passwodfield (String password ){
        driver.findElement(By.id("password")).sendKeys(password);


    }
    public void  signinButt ( ) {
        driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();

    }


    }
