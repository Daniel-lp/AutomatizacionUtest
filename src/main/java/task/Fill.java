package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.FillPage.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.FillPage.*;

public class Fill implements Task {
    private String name,lastName,email,day,month,year,city,zip_code,password;

    public Fill(String name, String lastName, String email, String day, String month, String year, String city
            ,String zip_code, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
        this.city = city;
        this.zip_code = zip_code;
        this.password = password;
    }

    public static Fill the(String name, String lastName, String email, String day, String month, String year,
                           String city,String zip_code, String password ) {
        return Tasks.instrumented(Fill.class,name,lastName,email,day,month,year,city,zip_code,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(INPUT_NAME),
                Enter.theValue(lastName).into(INPUT_LASTNAME),
                Enter.theValue(email).into(INPUT_EMAIL),
                Click.on(INPUT_MONTH),
                Click.on(INPUT_DAY),
                Click.on(INPUT_YEAR),
                Click.on(BUTTON_NEXT_LOCATION),
                Enter.theValue(city).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(INPUT_CITY)

                );
        actor.attemptsTo(
                Enter.theValue(zip_code).into(POSTAL_CODE),
                Scroll.to(BUTTON_NEXT_LOCATION_TWO),
                Click.on(BUTTON_NEXT_LOCATION_TWO),
                Click.on(BUTTON_NEXT_LOCATION_THREE),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Enter.theValue(password).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_ONE),
                Click.on(CHECK_TWO),
                Click.on(CHECK_THREE)
                /*
                Esta linea esta documentada para evitar la automatizacion del click en el boton que finaliza el registro
                ya que el test fallaria por la verificacion de "no soy un robot"
                Click.on(BUTTON_NEXT_LOCATION_LAST)
                 */


        );

    }

}
