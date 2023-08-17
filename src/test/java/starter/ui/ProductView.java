package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductView {

    public  static Target SORT_BY_BUTTON = Target.the("Sort by: ")
                             .located(By.xpath("//android.view.ViewGroup[@content-desc=\"sort button\"]/android.widget.ImageView"));
    public  static Target NAME_DESCENDING_OPTION = Target.the("Sort by Name - Descending ")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'Name - Descending')]"));

    public  static Target PRODUCT3 = Target.the("element 3")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[3]/android.view.ViewGroup[1]/android.widget.ImageView"));

}


//android.widget.TextView[contains(@text, 'Price - Ascending')]