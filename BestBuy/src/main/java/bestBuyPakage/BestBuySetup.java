package bestBuyPakage;

import commonApiPackage.CommonApiClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class BestBuySetup  extends CommonApiClass {

  public void BestBuypagesetup() {
      System.out.println(driver.getTitle());

  }

  //public void Account() throws InterruptedException {

      //driver.findElement(By.id("hf_accountMenuLink")).click();
  //}



  public void signup () {
      Alert alert =  driver.switchTo().alert();
      System.out.println(alert.getText());
   String email = alert.getText();
   if (email.equalsIgnoreCase("Know what would make a great gift? \n" +
           "We do.")){
       System.out.println("pass");
   }else System.out.println("faild");

  }


}
