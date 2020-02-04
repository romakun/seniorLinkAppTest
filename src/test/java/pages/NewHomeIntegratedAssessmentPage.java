package pages;


import elements.SFInput;
import elements.SFSelect;
import elements.SFTextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewHomeIntegratedAssessmentPage extends BasePage{


    private By SAVE_BUTTON = By.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='Save']");




    public NewHomeIntegratedAssessmentPage(WebDriver driver) {
        super(driver);
    }

    public NewHomeIntegratedAssessmentPage openPage() {
        isPageLoaded(By.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='Save']"));
        PageFactory.initElements(driver, NewHomeIntegratedAssessmentPage.this);
        return this;
    }

    public NewHomeIntegratedAssessmentPage completeForm(){
        new SFInput().write(driver, "Assessment Date", "1/30/2020");
        new SFInput().write(driver, "Date Assessor Signed", "1/30/2020");
        new SFSelect().select(driver, "Status", "In Progress");
        new SFSelect().select(driver, "Assessment Type", "Update");
        new SFSelect().select(driver, "Dwelling Type", "Single (Detached) dwelling");
        new SFSelect().select(driver, "Accessibility Concerns", "Yes");
        new SFSelect().select(driver, "Family Living On", "Single Level -- Upper");
        new SFSelect().select(driver, "Number of Bedrooms", "2 Bedrooms");
        new SFSelect().select(driver, "Internet in Home", "No");
        new SFSelect().select(driver, "Stairs Required to Consumer Bedroom", "Yes");
        new SFSelect().select(driver, "Wifi in Home", "Yes");
        new SFSelect().select(driver, "Number of Bathrooms", "3 Bathrooms");
        new SFSelect().select(driver, "Computer / Tablet in Home", "Yes");
        new SFSelect().select(driver, "Stairs Required to Consumer Bathroom", "Yes");
        new SFSelect().select(driver, "Caregiver Smart Phone", "No");
        new SFSelect().select(driver, "Caregiver Smart Phone Brand", "Android");
        new SFSelect().select(driver, "Caregiver Technology Proficiency", "Poor");
        new SFSelect().select(driver, "Home Ownership (Current Status)", "Rental");
        new SFSelect().select(driver, "Home Stability", "Appears Stable");
        new SFSelect().select(driver, "Life Essentials", "Yes - Adequate");
        new SFSelect().select(driver, "Energy Assistance", "No");
        new SFSelect().select(driver, "Food Assistance", "Yes");
        new SFSelect().select(driver, "Referral for Energy Assistance", "Yes");
        new SFSelect().select(driver, "Referral for Food Assistance", "No");
        new SFSelect().select(driver, "Pets In Home?", "No");
        new SFSelect().select(driver, "Smokers in the Home", "Yes");
        new SFSelect().select(driver, "Problems with Pets", "Yes");
        new SFSelect().select(driver, "Overall Safety Concerns", "Deferred");
        new SFSelect().select(driver, "Does Consumer Feel Safe?", "Refuses");
        new SFSelect().select(driver, "Does Caregiver Feel Safe?", "Yes");
        new SFTextArea().write(driver, "Accessibility Concerns Explained", "Hello World!");
        new SFTextArea().write(driver, "Home Description Comments", "Hello World!");
        new SFTextArea().write(driver, "Home Meaning Comments", "Hello World!");
        new SFTextArea().write(driver, "Home Story Comments", "Hello World!");
        new SFTextArea().write(driver, "Home Story Comments", "Hello World!");
        new SFTextArea().write(driver, "Energy Assistance Comments", "Hello World!");
        new SFTextArea().write(driver, "Food Assistance Comments", "Hello World!");
        new SFTextArea().write(driver, "Smokers Comments", "Hello World!");
        new SFTextArea().write(driver, "Pets Comments", "Hello World!");
        new SFTextArea().write(driver, "Life Essentials General Comments", "Hello World!");
        new SFTextArea().write(driver, "Neighborhood Safety Comments", "Hello World!");
        new SFTextArea().write(driver, "General Security Comments", "Hello World!");
        new SFTextArea().write(driver, "Consumer Safety Comments", "Hello World!");
        new SFTextArea().write(driver, "Caregiver Safety Comments", "Hello World!");
        new SFTextArea().write(driver, "Home/Environment Comments", "Hello World!");


        return this;
    }

    public void save(){
        driver.findElement(SAVE_BUTTON).click();
    }
}
