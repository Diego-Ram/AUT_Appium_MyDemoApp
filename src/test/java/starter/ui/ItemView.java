package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ItemView {

    public  static Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'Add To Cart')]"));
}
