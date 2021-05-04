package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/welcome?from=signup")
public class AutomationChallengePage extends PageObject {
    public static final Target JOIN_BUTTON=Target.the("button to start the creation of new profile").located(By.className("unauthenticated-nav-bar__sign-up"));
}
