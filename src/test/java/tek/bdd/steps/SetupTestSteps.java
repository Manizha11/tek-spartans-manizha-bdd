package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

import java.sql.SQLOutput;

public class SetupTestSteps extends SeleniumUtility {

    @Given("Open browser and navigate to retail app")
    public void OpenBrowserAndNavigateToRetailApp() {
        setupBrowser();

    }
    @Then("Validate top left corner is TEKSCHOOL")
    public void ValidateTopLeftCornerIsTEKSCHOOL(){
       String tekSchoolLogo = getElementText(By.linkText("TEKSCHOOL"));
        Assert.assertEquals("TEKSCHOOL",tekSchoolLogo);
        System.out.println(tekSchoolLogo);


    }
    @Then("Close browser")
    public void CloseBrowser(){

    }
}