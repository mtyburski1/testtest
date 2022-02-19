import org.testng.Assert;
import org.testng.annotations.Test;
import page.MenuPage;
import page.MyAccPage;

public class Tests extends BaseTest{
    @Test
    public void firstTest() throws InterruptedException {
        driver.get("http://www.selenium-shop.pl/");
        MenuPage menuPage = new MenuPage(driver);
        menuPage.myAccClick();
        MyAccPage myAccPage = new MyAccPage(driver);
        Assert.assertEquals(myAccPage.howManyBtns(), 2);

        System.out.println("Przyciski: " + myAccPage.logInBtnText() + " " + myAccPage.registerBtnText());
    }
}
