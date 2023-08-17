package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.ItemView;
import starter.ui.LoginView;
import starter.ui.MyCartView;
import starter.ui.TopBarView;
import starter.utils.DataFakeGenerate;

public class BuyProductWithIncorrectCredentials implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ItemView.ADD_TO_CART_BUTTON),
                Click.on(TopBarView.CART_BUTTON),
                Click.on(MyCartView.PROCEED_TO_CHECKOUT_BUTTON));

        actor.attemptsTo(SendKeys.of(DataFakeGenerate.emailRandom()).into(LoginView.USERNAME_INPUT),
                SendKeys.of(DataFakeGenerate.passRandom()).into(LoginView.PASSWORD_INPUT),
                Click.on(LoginView.LOGIN_BUTTON));
    }
}
