package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyCartView {

    public  static Target PROCEED_TO_CHECKOUT_BUTTON = Target.the("Proceed To Checkout button")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'Proceed To Checkout')]"));
}
