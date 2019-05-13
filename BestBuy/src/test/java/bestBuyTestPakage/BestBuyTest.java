package bestBuyTestPakage;

import bestBuyPakage.BestBuySetup;
import org.testng.annotations.Test;

public class BestBuyTest extends BestBuySetup {

    @Test
    public void BestBuyPage() throws InterruptedException {
        BestBuypagesetup();
        Thread.sleep(3000);

        signup();
        Thread.sleep(3000);



    }




}



