package pages;


import elements.SFInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeIntegratedAssessmentPage extends BasePage{

    private By NEW_BUTTON = By.xpath("//div[@title='New']");
    private By SAVE_BUTTON = By.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='Save']");
    private By IN_PROGRESS_RADIO = By.xpath("//section[@aria-expanded='true']//span[text()='In Progress']//preceding-sibling::span[contains(@class,'slds-radio')]");
    private By NEXT_BUTTON = By.xpath("//span[text()='Next']");
    private By DUPLICATE_YES_BUTTON = By.xpath("//button[contains(@class,'slds-button slds-button') and text()='Yes']");



    public HomeIntegratedAssessmentPage(WebDriver driver) {
        super(driver);
    }

    public HomeIntegratedAssessmentPage openPage() {
        isPageLoaded(By.xpath("//div[@title='New']"));
        PageFactory.initElements(driver, HomeIntegratedAssessmentPage.this);
        return this;
    }

    public HomeIntegratedAssessmentPage clickNewButton(){
        driver.findElement(NEW_BUTTON).click();
        return this;
    }

    public HomeIntegratedAssessmentPage clickRadio(){
        isPageLoaded(By.xpath("//section[@aria-expanded='true']//span[text()='In Progress']//preceding-sibling::span[contains(@class,'slds-radio')]"));
        driver.findElement(IN_PROGRESS_RADIO).click();
        return this;
    }

    public HomeIntegratedAssessmentPage clickNext(){
        driver.findElement(NEXT_BUTTON).click();
        return this;
    }

    public HomeIntegratedAssessmentPage duplicateClickYes(){
       isPageLoaded(By.xpath("//button[contains(@class,'slds-button slds-button') and text()='Yes']"));
        driver.findElement(DUPLICATE_YES_BUTTON).click();
        return this;
    }

}
