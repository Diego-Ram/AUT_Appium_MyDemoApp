package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.ProductView;


public class SelectProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductView.SORT_BY_BUTTON),
                Click.on(ProductView.NAME_DESCENDING_OPTION),
                Click.on(ProductView.PRODUCT3));
    }

 }
