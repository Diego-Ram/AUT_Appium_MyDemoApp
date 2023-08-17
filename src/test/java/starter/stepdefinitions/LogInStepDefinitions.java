package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import org.hamcrest.Matchers;

import starter.questions.Answer;
import starter.task.BuyProduct;
import starter.task.BuyProductWithIncorrectCredentials;
import starter.task.SelectProduct;



import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.ui.CheckoutCompleteView.TEXT_CHECKOUT_COMPLETE;
import static starter.ui.LoginView.TEXT_ERROR_CREDENTIALS;

public class LogInStepDefinitions {


    @Given("The user wants to buy a new product")
    public void user_wants_to_buy_a_new_product() {
        theActorCalled("Jhon").attemptsTo(
                new SelectProduct());
    }
    @When("The user adds the product to the cart to buy it")
    public void user_adds_the_product_to_the_cart_to_buy_it(){
        theActorInTheSpotlight().attemptsTo(
                new BuyProduct());
    }

    @When("The user with out credentials adds the product to the cart to buy it")
    public void user_with_out_credentials_adds_the_product_to_the_cart_to_buy_it(){
        theActorInTheSpotlight().attemptsTo(new BuyProductWithIncorrectCredentials());
    }

    @Then("The user will see the next message (.*)$")
    public void the_user_will_see_the_next_message(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.message(
                TEXT_CHECKOUT_COMPLETE), Matchers.equalTo(message)));
    }

    @Then("The user check the next error")
    public void user_check_the_next_error(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.message(
                TEXT_ERROR_CREDENTIALS), Matchers.equalTo(message)));
    }
}
