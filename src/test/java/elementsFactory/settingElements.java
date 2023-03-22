package elementsFactory;

import elementsTest.commonElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class settingElements {
    AndroidDriver driver;

    public commonElement settingBtn;
    public commonElement currencyINR;


    public settingElements(AndroidDriver driver) {
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        settingBtn = new commonElement(By.xpath("//android.widget.Button[@text='Settings']"),driver);
        currencyINR = new commonElement(By.id("com.trivago:id/fragmentSettingsCurrencyTextView"),driver);
    }
}
