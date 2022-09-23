package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidateTextOf;
import tasks.LoginConduit;
import static userinterfaces.LoginConduitPage.TEX_TO_VALIDATE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class LoginConduitStepDefintions {

    @When("he enter the email {string} and password {string}")
    public void heEnterTheEmailAndPassword(String email, String password) {
        theActorInTheSpotlight().attemptsTo(LoginConduit.with(email, password));
    }

    @Then("validates teh text {string}")
    public void validatesTehText(String text) {
        theActorInTheSpotlight().should(seeThat(ValidateTextOf.in(text,TEX_TO_VALIDATE), equalTo(text)));
    }

}
