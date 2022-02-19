package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage.BasePage;

import java.util.List;

public class MyAccPage extends BasePage {
    public MyAccPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//button[@type='submit']")
    public List<WebElement> countBtns;

    @FindBy(xpath = "//*[@id='customer_login']/div[1]/form/p[3]/button")
    public WebElement logInBtn;

    @FindBy(xpath = "//*[@id='customer_login']/div[2]/form/p[3]/button")
    public WebElement registerBtn;

    public String logInBtnText(){
        return logInBtn.getText();
    }

    public String registerBtnText(){
        return registerBtn.getText();
    }

    public int howManyBtns(){
       return countBtns.size();
    }
}
