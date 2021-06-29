package user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class ReservaPage {

    public static final Target TXT_LUGAR =
            the("CAMPO DE TEXTO LUGAR DE SALIDA").located(xpath("//div[@data-stid='location-field-destination']"));

    public static final Target TXT_LUGAR2 =
            the("CAMPO DE TEXTO 2 LUGAR DE SALIDA").located(xpath("//input[@data-stid='location-field-destination-menu-input']"));

    public static final Target DTP_CHECKIN =
            the("DATA PICKER CHECK IN").located(xpath("//button[contains(@aria-label,'Check-in')]"));

    public static final Target BTN_FECHAS_IDA_REGRESO =
            the("BOTON FECHAS DE IDA Y REGRESO").locatedBy("//button[contains(@aria-label,'{0}')]");

    public static final Target BOTON_CONFIRM_FECHAS =
            the("BOTON DONE").located(xpath("//span[text()='Done']"));

    public static final Target BOTON_VIAJEROS =
            the("BOTON VIAJEROS").located(xpath("//button[contains(@data-testid,'travelers-field-trigger')]"));

    public static final Target BOTON_CONFIRM_VIAJEROS =
            the("BOTON CONFIRMACION VIAJEROS").located(xpath("//button[contains(text(),'Done')]"));

    public static final Target BOTON_BUSQUEDA =
            the("BOTON SUBMIT BUSQUEDA").located(xpath("//button[@data-testid='submit-button']"));

    public static final Target LBL_MENSAJE_ALERTA =
            the("LABEL MENSAJE DE ALERTA COVID").located(xpath("//p[@class='uitk-experimental-banner-body']"));
}