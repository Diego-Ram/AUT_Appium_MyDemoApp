package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TopBarView {

    public  static Target CART_BUTTON = Target.the("cart button ")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]"));

}
