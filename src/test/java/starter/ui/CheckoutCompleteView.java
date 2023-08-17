package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutCompleteView {

    public  static Target TEXT_CHECKOUT_COMPLETE = Target.the("Checkout Complete text")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'Checkout Complete')]"));
}
