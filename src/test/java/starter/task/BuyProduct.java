package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.*;
import starter.utils.DataFakeGenerate;

public class BuyProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ItemView.ADD_TO_CART_BUTTON),
                Click.on(TopBarView.CART_BUTTON),
                Click.on(MyCartView.PROCEED_TO_CHECKOUT_BUTTON));

        actor.attemptsTo(SendKeys.of("bob@example.com").into(LoginView.USERNAME_INPUT),
                SendKeys.of("10203040").into(LoginView.PASSWORD_INPUT),
                Click.on(LoginView.LOGIN_BUTTON));

        actor.attemptsTo(SendKeys.of(DataFakeGenerate.fullName()).into(CheckoutView.FULL_NAME_INPUT),
                SendKeys.of(DataFakeGenerate.address1()).into(CheckoutView.ADDRESS_LINE1_INPUT),
                SendKeys.of(DataFakeGenerate.address2()).into(CheckoutView.ADDRESS_LINE2_INPUT),
                SendKeys.of(DataFakeGenerate.city()).into(CheckoutView.CITY_INPUT),
                SendKeys.of(DataFakeGenerate.state()).into(CheckoutView.STATE_INPUT),
                SendKeys.of(DataFakeGenerate.zipcode()).into(CheckoutView.ZIPCODE_INPUT),
                SendKeys.of(DataFakeGenerate.country()).into(CheckoutView.COUNTRY_INPUT),
                Click.on(CheckoutView.TO_PAYMENT_BUTTON));

        actor.attemptsTo(SendKeys.of(DataFakeGenerate.fullName()).into(CheckoutView.FULL_NAME_INPUT),
                SendKeys.of("12345" + DataFakeGenerate.card()).into(CheckoutView.CARD_NUMBER_INPUT),
                SendKeys.of("0"+DataFakeGenerate.expDate()).into(CheckoutView.EXPIRATION_DATE_INPUT),
                SendKeys.of(DataFakeGenerate.securityCode()+"").into(CheckoutView.SECURITY_CODE_INPUT),
                Click.on(CheckoutView.REVIEW_ORDER_BUTTON));

        actor.attemptsTo(Click.on(CheckoutView.PLACE_ORDER_BUTTON));
    }


}
