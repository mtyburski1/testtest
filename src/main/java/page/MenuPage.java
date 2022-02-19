package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage.BasePage;

public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//*[@id='menu-item-137']/a")
    private WebElement shopTabBtn;

    @FindBy(xpath = "//*[@id='menu-item-136']/a")
    private WebElement myAccBtn;

    @FindBy(xpath = "//*[@id='menu-item-134']/a")
    private WebElement formBtn;

    public FormPage formClick(){
        formBtn.click();
        return new FormPage(driver);
    }

    public MenuPage myAccClick(){
        myAccBtn.click();
        return this;
    }

    public MenuPage shopTabClick(){
        shopTabBtn.click();
        return this;
    }
}
