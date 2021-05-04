package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.User;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import task.Fill;
import task.OpenUp;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AutomationChallengeStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that (.*) wants create a new profile on Utest$")
    public void thatDanielWantsCreateANewProfileOnUtest(String actor) {
        theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }

    @When("^he complying all the require steps$")
    public void heComplyingAllTheRequireSteps(List<User> user) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Fill.the(user.get(0).getName(),
                user.get(0).getLastName(),
                user.get(0).getEmail(),
                user.get(0).getDay(),
                user.get(0).getMonth(),
                user.get(0).getYear(),
                user.get(0).getCity(),
                user.get(0).getZip_code(),
                user.get(0).getPassword()));
    }

    @Then("^the profile is create successful$")
    public void theProfileIsCreateSuccessful() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("The last step")));


    }

}
