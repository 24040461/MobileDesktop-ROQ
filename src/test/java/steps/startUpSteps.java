package steps;

import elementsFactory.globalElements;
import elementsFactory.homeElements;
import elementsFactory.settingElements;
import driverFactory.driverFactory;
import elementsFactory.startingUpElements;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class startUpSteps {
    AndroidDriver driver;
    driverFactory browsers;

    private startingUpElements startUp = new startingUpElements(driverFactory.getdriver());
    private homeElements home = new homeElements(driverFactory.getdriver());
    private settingElements setting = new settingElements(driverFactory.getdriver());
    private globalElements global = new globalElements(driverFactory.getdriver());
    @Given("user see the welcome screen")
   public void user_see_the_welcome_screen() {
       startUp.weclomeTitle.waitUnitIsDisplayed();
   }
    @When("user clicks confirm")
    public void user_clicks_confirm() {
        startUp.confirmBtn.click();
    }
    @Then("user can see the home logo")
    public void user_can_see_the_home_logo() {
        startUp.acceptBtn.click();
        home.homeLogo.waitUnitIsDisplayed();
    }

    @When("user clicks on India english")
    public void userClicksOnIndiaEnglish() {
        startUp.indiaBTN.click();
        startUp.confirmBtn.click();
        startUp.acceptBtn.click();
    }

    @Then("user can see the currency is in Indian")
    public void userCanSeeTheCurrencyIsInIndian() {
        global.settingBtn.click();
        setting.currencyINR.waitUnitIsDisplayed();
    }
}
