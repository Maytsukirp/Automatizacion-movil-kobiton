package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_INPUT = Target.the( "input for write email")
            .located(By.id("org.wordpress.android:id/input"));

    public static final Target EMAIL_BUTTON = Target.the( "button next email")
            .located(By.id("org.wordpress.android:id/login_continue_button"));

    public static final Target PASSWORD_INPUT = Target.the( "input for write password")
            .located(By.id("org.wordpress.android:id/input"));

    public static final Target PASSWORD_BUTTON = Target.the( "button next password")
            .located(By.id("org.wordpress.android:id/bottom_button"));

    public static final Target TEXT_LABEL = Target.the( "text label for validations")
            .located(By.id("org.wordpress.android:id/login_epilogue_header_subtitle"));
}
