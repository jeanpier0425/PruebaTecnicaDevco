package user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class ThingsToDoPage {

    public static final Target BTN_THINGSTODO =
            the("BOTON COSAS PARA HACER").located(xpath("//span[text()='Things to do']"));

    public static final Target TXT_THINGSTODO =
            the("CAMPO DE TEXTO COSAS PARA HACER").located(xpath("//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']"));

    public static final Target TXT_THINGSTODO2 =
            the("CAMPO DE TEXTO COSAS PARA HACER 2").located(xpath("//input[@placeholder='Where are you going?']"));

    public static final Target DTP_THINGS =
            the("DATA PICKER FROM").located(xpath("//button[contains(@aria-label,'From')]"));

}
