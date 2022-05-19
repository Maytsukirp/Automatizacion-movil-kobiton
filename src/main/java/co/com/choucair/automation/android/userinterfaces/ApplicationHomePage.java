package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationHomePage {
    public static final Target LOGIN_BUTTON = Target.the( "login button")
            .located(By.id("org.wordpress.android:id/continue_with_wpcom_button"));
}

