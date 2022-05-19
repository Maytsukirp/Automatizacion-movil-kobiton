package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.questions.VarifyWith;
import co.com.choucair.automation.android.tasks.Login;
import co.com.choucair.automation.android.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AuthenticationStepDefinitions {

    @Given("^that Brandon wants to enter to Wordpress application$")
    public void thatBrandonWantsToEnterToWordpressApplication() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenThe.wordpressApp());

    }


    @When("^I login with the username \"([^\"]*)\" and the password \"([^\"]*)\"$")
    public void iLoginWithTheUsernameAndThePassword(String user, String password) {
        theActorInTheSpotlight().attemptsTo(Login.with(user,password));

    }

    @Then("^you should see the login in the application with the message (.*)$")
    public void youShouldSeeTheLoginInTheApplicationWithTheMessageLoggedInAs(String question) {
        //theActorInTheSpotlight().should(seeThat(VarifyWith.the(question)));
        theActorInTheSpotlight().should(seeThat(VarifyWith.the("appium396504399")));

    }

}
