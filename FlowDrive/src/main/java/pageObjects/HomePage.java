package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "com.thefloow.flo:id/tab_journeys")
    public static WebElement journeysTab;

    @FindBy(id = "com.thefloow.flo:id/tab_social")
    public static WebElement socialTab;

    @FindBy(id = "com.thefloow.flo:id/img_start_journey")
    public static WebElement startJourney;
}
