package tests;

import models.Fields;
import models.User;
import org.testng.annotations.Test;
import pages.HomeIntegratedAssessmentPage;
import pages.NewHomeIntegratedAssessmentPage;
import pages.login.LogInPage;

public class CreateNewForm extends BaseTest {

    @Test
    public void LogIn() {

        Fields options = Fields.builder()
                .AssessmentDate("1/30/2020")
                .DateAssessorSigned("1/30/2020")
                .Status("In Progress")
                .AssessmentType("Update")
                .DwellingType("Single (Detached) dwelling")
                .AccessibilityConcerns("Yes")
                .FamilyLivingOn("Single Level -- Upper")
                .NumberOfBedrooms("2 Bedrooms")
                .InternetInHome("No")
                .StairsRequiredToConsumerBedroom("Yes")
                .WifiInHome("Yes")
                .NumberOfBathrooms("3 Bathrooms")
                .ComputerTabletInHome("Yes")
                .StairsRequiredToConsumerBathroom("Yes")
                .CaregiverSmartPhone("No")
                .CaregiverSmartPhoneBrand("Android")
                .CaregiverTechnologyProficiency("Poor")
                .HomeOwnershipCurrentStatus("Rental")
                .HomeStability("Appears Stable")
                .LifeEssentials("Yes - Adequate")
                .EnergyAssistance("No")
                .FoodAssistance("Yes")
                .ReferralForEnergyAssistance("Yes")
                .ReferralForFoodAssistance("No")
                .PetsInHome("No")
                .SmokersInTheHome("Yes")
                .ProblemsWithPets("Yes")
                .OverallSafetyConcerns("Deferred")
                .DoesConsumerFeelSafe("Refuses")
                .DoesCaregiverFeelSafe("Yes")
                .AccessibilityConcernsExplained("Hello World!")
                .HomeDescriptionComments("Hello World!")
                .HomeMeaningComments("Hello World!")
                .HomeStoryComments("Hello World!")
                .HomeStabilityComments("Hello World!")
                .EnergyAssistanceComments("Hello World!")
                .FoodAssistanceComments("Hello World!")
                .SmokersComments("Hello World!")
                .PetsComments("Hello World!")
                .LifeEssentialsGeneralComments("Hello World!")
                .NeighborhoodSafetyComments("Hello World!")
                .GeneralSecurityComments("Hello World!")
                .ConsumerSafetyComments("Hello World!")
                .CaregiverSafetyComments("Hello World!")
                .HomeEnvironmentComments("Hello World!")
                .build();

        User validUser = new User(props.get("username"), props.get("password"));

        new LogInPage(driver)
                .openPage()
                .logIn(validUser);
        new HomeIntegratedAssessmentPage(driver)
                .openPage()
                .clickNewButton()
                .clickRadio()
                .clickNext()
                .duplicateClickYes();
        new NewHomeIntegratedAssessmentPage(driver)
                .openPage()
                .completeForm(options)
                .save();
    }
}
