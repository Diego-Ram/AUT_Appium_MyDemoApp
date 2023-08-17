package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

    public  static Target USERNAME_INPUT = Target.the("Username")
            .located(AppiumBy.accessibilityId("Username input field"));
    public  static Target PASSWORD_INPUT = Target.the("Password")
            .located(AppiumBy.accessibilityId("Password input field"));
    public  static Target LOGIN_BUTTON = Target.the("Login button")
            .located(AppiumBy.accessibilityId("Login button"));
    public  static Target TEXT_ERROR_CREDENTIALS = Target.the("bad credentials text")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'Provided credentials do not match any user in this service.')]"));
}
