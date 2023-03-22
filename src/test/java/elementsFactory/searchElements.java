package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class searchElements {
    AndroidDriver driver;

    public commonElement searchTextBox;
    public commonElement searchResultClick;
    public commonElement datesAcceptBtn;
    public commonElement bestPriceDeal;
    public commonElement filterBtn;
    public commonElement ratingValue;
    public commonElement favBtn;


    public searchElements(AndroidDriver driver) {
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        searchTextBox = new commonElement(By.id("com.trivago:id/activitySearchDestinationSearchEditText"),driver);
        searchResultClick = new commonElement(By.xpath("//android.widget.TextView[@text='City - England, United Kingdom']"),driver);
        datesAcceptBtn = new commonElement(By.id("com.trivago:id/activityDatesSelectionCalendarApplyTextView"),driver);
        bestPriceDeal =new commonElement(By.id("com.trivago:id/viewBestDealPriceTextView"),driver);
        filterBtn =new commonElement(By.id("com.trivago:id/fragmentAccommodationSearchResultsFiltersTextView"),driver);
        ratingValue =new commonElement(By.id("com.trivago:id/accommodationRatingRateTextView"),driver);
        favBtn =new commonElement(By.id("com.trivago:id/accommodationFavoriteButtonAnimationView"),driver);



    }
}
