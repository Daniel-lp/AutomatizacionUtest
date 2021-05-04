package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AutomationChallengePage;

public class OpenUp implements Task {
    AutomationChallengePage automationChallengePage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(automationChallengePage),Click.on(AutomationChallengePage.JOIN_BUTTON));
    }
}
