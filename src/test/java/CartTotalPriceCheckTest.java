import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FormPage;
import page.MenuPage;
import static org.assertj.core.api.Assertions.*;

public class CartTotalPriceCheckTest extends BaseTest{
    @Test
    public void shouldDisplayInfo(){

        FormPage formPage = new FormPage(driver);
        assertThat(new MenuPage(driver)
                .formClick()
                .setFirstName("Wojtek")
                .setGender(1)
                .setAge(2)
                .yourCommentSendText("Gdańsk")
                .isSendBtnDisplayed());

        formPage.sendFormClick();
        System.out.println(driver.findElement(By.id("info")).getText());
    }
    public void shouldDisplaySports(){
        MenuPage menuPage = new MenuPage(driver);
        menuPage
                .formClick()
                .getSportSpecFromList(0);
    }

}
