package steps;

import driverFactory.driverFactory;
import elementsFactory.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class favSteps {
    private globalElements global = new globalElements(driverFactory.getdriver());
    private startingUpElements startUp = new startingUpElements(driverFactory.getdriver());
    private searchElements search = new searchElements(driverFactory.getdriver());
    private homeElements home = new homeElements(driverFactory.getdriver());
    private settingElements setting = new settingElements(driverFactory.getdriver());
    private filterElements filters = new filterElements(driverFactory.getdriver());
    @And("user favs first item")
    public void userFavsFirstItem() {
        search.favBtn.click();
        global.favBtn.click();
    }

    @Then("user sees fav in favourites")
    public void userSeesFavInFavourites() {
        global.favResult.waitUnitIsDisplayed();
    }
}
