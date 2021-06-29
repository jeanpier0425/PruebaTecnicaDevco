package user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class FlightPage {

    public static final Target BTN_FLIGHT =
            the("BOTON FLIGHT").located(xpath("//a[contains(@href,'?pwaLob=wizard-flight-pwa')]"));

    public static final Target BTN_ONE_WAY =
            the("BOTON ONE WAY").located(xpath("//span[text()='One-way']"));

    public static final Target TXT_LUGAR_SALIDA =
            the("CAMPO DE TEXTO LUGAR DE SALIDA").located(xpath("//label[@for='location-field-leg1-origin-input']"));

    public static final Target TXT_LUGAR_SALIDA2 =
            the("CAMPO DE TEXTO LUGAR DE SALIDA2").located(xpath("//input[@placeholder='Where are you leaving from?']"));

    public static final Target TXT_LUGAR_LLEGADA =
            the("CAMPO DE TEXTO LUGAR DE LLEGADA").located(xpath("//div[@title='Going to']"));

    public static final Target TXT_LUGAR_LLEGADA2 =
            the("CAMPO DE TEXTO LUGAR DE LLEGADA 2").located(xpath("//input[@placeholder='Where are you going to?']"));

    public static final Target DTP_FECHA_SALIDA =
            the("DATA PICKER FECHA SALIDA").located(xpath("//button[contains(@aria-label,'Departing')]"));

    public static final Target LBL_MENSAJE_VUELO =
            the("LABEL MENSAJE ELECCION VUELO").located(xpath("//span[text()='Choose departing flight']"));

}
