package steps;

import driverFactory.driverFactory;
import elementsFactory.*;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
    AndroidDriver driver;
    driverFactory browsers;


    private globalElements global = new globalElements(driverFactory.getdriver());
    private startingUpElements startUp = new startingUpElements(driverFactory.getdriver());
    private searchElements search = new searchElements(driverFactory.getdriver());
    private homeElements home = new homeElements(driverFactory.getdriver());
    private settingElements setting = new settingElements(driverFactory.getdriver());
    private filterElements filters = new filterElements(driverFactory.getdriver());
    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        startUp.weclomeTitle.waitUnitIsDisplayed();
        startUp.confirmBtn.click();
        startUp.acceptBtn.click();
        home.homeLogo.waitUnitIsDisplayed();
    }
    @When("user searches for a destination {string}")
    public void userSearchesForADestination(String destination) {
        home.destSearch.click();
        search.searchTextBox.type(destination);
    }
    @And("user clicks search")
    public void userClicksSearch() {
        search.searchResultClick.click();
        search.datesAcceptBtn.click();
    }

    @And("and user clicks on the stays on the bottom bar")
    public void andUserClicksOnTheStaysOnTheBottomBar() {
        global.staysBtn.click();
    }

    @Then("user will see Burnley in recent searches")
    public void userWillSeeBurnleyInRecentSearches() {
        home.recentSearchResult.waitUnitIsDisplayed();
    }

    @And("user clicks filters")
    public void userClicksFilters() {
        search.filterBtn.click();
    }

    @And("user clicks on highest")
    public void userClicksOnHighest() {
        filters.ratingBtn.click();
        filters.confirmBtn.click();
    }

    @Then("user will see the highest rating")
    public void userWillSeeTheHighestRating() {
        search.ratingValue.waitUnitIsDisplayed();
    }


}
