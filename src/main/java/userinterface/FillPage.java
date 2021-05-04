package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage {
    public static final Target  INPUT_NAME=Target.the("where we write the name").located(By.id("firstName"));
    public static final Target  INPUT_LASTNAME=Target.the("where we write the lastname").located(By.id("lastName"));
    public static final Target  INPUT_EMAIL=Target.the("where we write the email").located(By.id("email"));
    public static final Target  INPUT_DAY=Target.the("where we write the day").located(By.xpath("//*[@id=\"birthDay\"]/option[13]"));
    public static final Target  INPUT_MONTH=Target.the("where we write the month").located(By.xpath("//*[@id=\"birthMonth\"]/option[3]"));
    public static final Target  INPUT_YEAR=Target.the("where we write the year").located(By.xpath("//*[@id=\"birthYear\"]/option[7]"));
    public static final Target  BUTTON_NEXT_LOCATION=Target.the("button to go to the next step:location").located(By.className("btn-blue"));
    public static final Target  INPUT_CITY=Target.the("select the city").located(By.id("city"));
    public static final Target  POSTAL_CODE=Target.the("write the postal code").located(By.id("zip"));
    public static final Target  BUTTON_NEXT_LOCATION_TWO=Target.the("button to go to the next step:devices").located(By.className("next-step"));
    public static final Target  BUTTON_NEXT_LOCATION_THREE=Target.the("button to go to the next step:devices").located(By.className("next-step"));
    public static final Target  INPUT_PASSWORD=Target.the("where we write the password").located(By.id("password"));
    public static final Target  INPUT_CONFIRM_PASSWORD=Target.the("where we write the confirm password").located(By.id("confirmPassword"));
    public static final Target  CHECK_ONE=Target.the("check the option one").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target  CHECK_TWO=Target.the("check the option one").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target  CHECK_THREE=Target.the("check the option one").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target  BUTTON_NEXT_LOCATION_LAST=Target.the("button to go to the next step:last").located(By.className("next-step"));
    public static final Target  MESSAGE_INIT=Target.the("choose a mesaage to confirm the profile ").located(By.className("section-big-title-unauth"));
    public static final Target  MESSAGE_LAST=Target.the("choose a mesaage to confirm the profile ").located(By.className("sub-title"));





}
