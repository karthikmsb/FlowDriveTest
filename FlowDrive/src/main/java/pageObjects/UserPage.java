package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {

    @FindBy(id = "com.thefloow.flo:id/text_view_create_account")
    public static WebElement signUp;

      // User Registration Page

    @FindBy(id = "com.thefloow.flo:id/edit_text_first_name")
    public static WebElement fname;

    @FindBy(id = "com.thefloow.flo:id/edit_text_surname")
    public static WebElement lname;

    @FindBy(id = "com.thefloow.flo:id/edit_text_company_name")
    public static WebElement company;

    @FindBy(id = "com.thefloow.flo:id/edit_text_email")
    public static WebElement email;

    @FindBy(id = "com.thefloow.flo:id/edit_text_postcode")
    public static WebElement postcode;

    @FindBy(id = "com.thefloow.flo:id/edit_text_date_of_birth")
    public static WebElement dateOfBirth;


    @FindBy(id = "com.thefloow.flo:id/edit_text_password")
    public static WebElement regpassword;

    @FindBy(id = "com.thefloow.flo:id/edit_text_confirm_password")
    public static WebElement confirmpassword;


    @FindBy(id = "com.thefloow.flo:id/button_register")
    public static WebElement submit;

    //Login Page

    @FindBy(id = "com.thefloow.flo:id/edit_text_email")
    public static WebElement username;

    @FindBy(id = "com.thefloow.flo:id/edit_text_password")
    public static WebElement password;

    @FindBy(id = "com.thefloow.flo:id/btn_login")
    public static WebElement loginBtn;

    //User Profile
    @FindBy(id = "com.thefloow.flo:id/social_screen_name")
    public static WebElement name;

    @FindBy(id = "com.thefloow.flo:id/social_next")
    public static WebElement nextBtn;

    @FindBy(id = "com.thefloow.flo:id/social_desc")
    public static WebElement description;

    @FindBy(id = "com.thefloow.flo:id/social_done")
    public static WebElement done;

    @FindBy(id = "com.thefloow.flo:id/profile_name")
    public static WebElement profile;
}
