package user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class PackagePage {

    public static final Target BTN_PACKACGE =
            the("BOTON PACKACGE").located(xpath("//a[contains(@href,'?pwaLob=wizard-package-pwa')]"));

    public static final Target TXT_SALIDA_PACKAGE =
            the("CAMPO DE TEXTO SALIDA PACKAGE").located(xpath("//label[@for='location-field-origin-input']/.."));
}
