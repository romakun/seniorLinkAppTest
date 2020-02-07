package pages;


import elements.SFInput;
import elements.SFSelect;
import elements.SFTextArea;
import models.Fields;
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

    public NewHomeIntegratedAssessmentPage completeForm(Fields options){
        //new SFInput().write(driver, "Assessment Date", options.getAssessmentDate());
        //new SFInput().write(driver, "Date Assessor Signed", options.getDateAssessorSigned());
        new SFSelect().select(driver, "Status", options.getStatus());
        new SFSelect().select(driver, "Assessment Type", options.getAssessmentType());
        new SFSelect().select(driver, "Dwelling Type", options.getDwellingType());
        new SFSelect().select(driver, "Accessibility Concerns", options.getAccessibilityConcerns());
        new SFSelect().select(driver, "Family Living On", options.getFamilyLivingOn());
        new SFSelect().select(driver, "Number of Bedrooms", options.getNumberOfBedrooms());
        new SFSelect().select(driver, "Internet in Home", options.getInternetInHome());
        new SFSelect().select(driver, "Stairs Required to Consumer Bedroom", options.getStairsRequiredToConsumerBedroom());
        new SFSelect().select(driver, "Wifi in Home", options.getWifiInHome());
        new SFSelect().select(driver, "Number of Bathrooms", options.getNumberOfBathrooms());
        new SFSelect().select(driver, "Computer / Tablet in Home", options.getComputerTabletInHome());
        new SFSelect().select(driver, "Stairs Required to Consumer Bathroom", options.getStairsRequiredToConsumerBathroom());
        new SFSelect().select(driver, "Caregiver Smart Phone", options.getCaregiverSmartPhone());
        new SFSelect().select(driver, "Caregiver Smart Phone Brand", options.getCaregiverSmartPhoneBrand());
        new SFSelect().select(driver, "Caregiver Technology Proficiency", options.getCaregiverTechnologyProficiency());
        new SFSelect().select(driver, "Home Ownership (Current Status)", options.getHomeOwnershipCurrentStatus());
        new SFSelect().select(driver, "Home Stability", options.getHomeStability());
        new SFSelect().select(driver, "Life Essentials", options.getLifeEssentials());
        new SFSelect().select(driver, "Energy Assistance", options.getEnergyAssistance());
        new SFSelect().select(driver, "Food Assistance", options.getFoodAssistance());
        new SFSelect().select(driver, "Referral for Energy Assistance", options.getReferralForEnergyAssistance());
        new SFSelect().select(driver, "Referral for Food Assistance", options.getReferralForFoodAssistance());
        new SFSelect().select(driver, "Pets In Home?", options.getPetsInHome());
        new SFSelect().select(driver, "Smokers in the Home", options.getSmokersInTheHome());
        new SFSelect().select(driver, "Problems with Pets", options.getProblemsWithPets());
        new SFSelect().select(driver, "Overall Safety Concerns", options.getOverallSafetyConcerns());
        new SFSelect().select(driver, "Does Consumer Feel Safe?", options.getDoesConsumerFeelSafe());
        new SFSelect().select(driver, "Does Caregiver Feel Safe?", options.getDoesCaregiverFeelSafe());
        new SFTextArea().write(driver, "Accessibility Concerns Explained", options.getAccessibilityConcernsExplained());
        new SFTextArea().write(driver, "Home Description Comments", options.getHomeDescriptionComments());
        new SFTextArea().write(driver, "Home Meaning Comments", options.getHomeMeaningComments());
        new SFTextArea().write(driver, "Home Story Comments", options.getHomeStoryComments());
        new SFTextArea().write(driver, "Home Stability Comments", options.getHomeStabilityComments());
        new SFTextArea().write(driver, "Energy Assistance Comments", options.getEnergyAssistanceComments());
        new SFTextArea().write(driver, "Food Assistance Comments", options.getFoodAssistanceComments());
        new SFTextArea().write(driver, "Smokers Comments", options.getSmokersComments());
        new SFTextArea().write(driver, "Pets Comments", options.getPetsComments());
        new SFTextArea().write(driver, "Life Essentials General Comments", options.getLifeEssentialsGeneralComments());
        new SFTextArea().write(driver, "Neighborhood Safety Comments", options.getNeighborhoodSafetyComments());
        new SFTextArea().write(driver, "General Security Comments", options.getGeneralSecurityComments());
        new SFTextArea().write(driver, "Consumer Safety Comments", options.getConsumerSafetyComments());
        new SFTextArea().write(driver, "Caregiver Safety Comments", options.getCaregiverSafetyComments());
        new SFTextArea().write(driver, "Home/Environment Comments", options.getHomeEnvironmentComments());


        return this;
    }

    public void save(){
        driver.findElement(SAVE_BUTTON).click();
    }
}
