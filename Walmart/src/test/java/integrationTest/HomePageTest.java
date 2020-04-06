package integrationTest;

        import basePackage.CommonAPIClass;
        import integration.HomePage;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Parameters;
        import org.testng.annotations.Test;

public class HomePageTest extends CommonAPIClass {

    HomePage homePage;


    @BeforeMethod
    @Parameters({"url","browser"})
    public void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test(enabled = true)
    public void setCognizantTest(){
        homePage.setCognizantsign();
    }


}
