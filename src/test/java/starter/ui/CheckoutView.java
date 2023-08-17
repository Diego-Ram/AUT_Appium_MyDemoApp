package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutView {

    public  static Target FULL_NAME_INPUT = Target.the("Full name input")
            .located(AppiumBy.accessibilityId("Full Name* input field"));
    public  static Target ADDRESS_LINE1_INPUT = Target.the("address line 1")
            .located(AppiumBy.accessibilityId("Address Line 1* input field"));
    public  static Target ADDRESS_LINE2_INPUT = Target.the("address line 2")
            .located(AppiumBy.accessibilityId("Address Line 2 input field"));
    public  static Target CITY_INPUT = Target.the("city")
            .located(AppiumBy.accessibilityId("City* input field"));
    public  static Target STATE_INPUT = Target.the("State/Region")
            .located(AppiumBy.accessibilityId("State/Region input field"));
    public  static Target ZIPCODE_INPUT = Target.the("Zip Code")
            .located(AppiumBy.accessibilityId("Zip Code* input field"));
    public  static Target COUNTRY_INPUT = Target.the("Country")
            .located(AppiumBy.accessibilityId("Country* input field"));
    public  static Target TO_PAYMENT_BUTTON = Target.the("Payment button")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'To Payment')]"));
    public  static Target CARD_NUMBER_INPUT = Target.the("Card Number")
            .located(AppiumBy.accessibilityId("Card Number* input field"));
    public  static Target EXPIRATION_DATE_INPUT = Target.the("Expiration Date")
            .located(AppiumBy.accessibilityId("Expiration Date* input field"));
    public  static Target SECURITY_CODE_INPUT = Target.the("Security Code")
            .located(AppiumBy.accessibilityId("Security Code* input field"));
    public  static Target REVIEW_ORDER_BUTTON = Target.the("review order button")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'Review Order')]"));
    public  static Target PLACE_ORDER_BUTTON = Target.the("place order button")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'Place Order')]"));
    public  static Target TEXT = Target.the("Billing address.......")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'Billing address is the same as shipping address')]"));
}
