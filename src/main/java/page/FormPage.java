package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import page.BasePage.BasePage;

import java.text.Normalizer;
import java.util.List;

public class FormPage extends BasePage {
    public FormPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//form//div//input[@id='Imię']")
    private List<WebElement> firstNameInput;

    @FindBy(css = "#Płeć")
    private List<WebElement> genderRadio;

    @FindBy(xpath = "//*[@id='Wiek']")
    private List<WebElement> ageRadio;

    @FindBy(css = "#Komentarz")
    private WebElement commentTextArea;

    @FindBy(xpath = "//input[@value='Wyślij']")
    private WebElement sendFormBtn;

    @FindBy(css = ".moj-select")
    public WebElement sportList;

    public FormPage getSportSpecFromList(int value){
        ((JavascriptExecutor) driver).executeScript("arguments["+ value +"].scrollIntoView(true);",
                new Select(sportList));
        return this;

    }

    public FormPage isSendBtnDisplayed(){
        sendFormBtn.isDisplayed();
        return this;
    }

    public FormPage sendFormClick(){
        sendFormBtn.click();
        return this;
    }

    public FormPage yourCommentSendText(String town){
        commentTextArea.sendKeys(town);
        return this;
    }

    public FormPage setAge(int value) {
        ageRadio.get(value).click();
        return this;
    }

    public FormPage setGender(int value){
        switch (value){
            case 0:
                genderRadio.get(0).click();
                break;
            case 1:
                genderRadio.get(1).click();
                break;
        }
        return this;
    }
    public FormPage setFirstName(String firstname){
        firstNameInput.get(0).clear();
        firstNameInput.get(0).sendKeys(firstname);
        return this;
    }
}
