package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JourneyPage {

    // Home Page

    @FindBy(id = "com.thefloow.flo:id/btn_emergency")
    public static WebElement emergencyBtn;

    @FindBy(id = "com.thefloow.flo:id/emergency_btn_breakdown")
    public static WebElement breakdown;

    @FindBy(id = "com.thefloow.flo:id/btn_call_now")
    public static WebElement callNow;

    @FindBy(id = "")
    public static WebElement callText;

    @FindBy(id = "com.thefloow.flo:id/emergency_btn_accident")
    public static WebElement accident;


        @FindBy(id = "com.thefloow.flo:id/journey_group")
        public static List<WebElement> journeysTable;

}
