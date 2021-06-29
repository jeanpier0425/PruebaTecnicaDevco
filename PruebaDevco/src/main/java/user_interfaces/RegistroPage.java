package user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class RegistroPage {

    public static final Target BTN_SIGNIN =
            the("BOTON SIGN IN").located(xpath("//button[text()='Sign in']"));

    public static final Target BTN_CREAR_CUENTA =
            the("BOTON CREAR CUENTA").located(xpath("//a[text()='Create a free account']"));

    public static final Target TXT_NOMBRE =
            the("CAMPO DE TEXTO NOMBRE").located(xpath("//input[@id='create-account-firstname']"));

    public static final Target TXT_APELLIDO =
            the("CAMPO DE TEXTO APELLIDO").located(xpath("//input[@id='create-account-lastname']"));

    public static final Target TXT_EMAIL =
            the("CAMPO DE TEXTO EMAIL").located(xpath("//input[@id='create-account-emailId']"));

    public static final Target TXT_PASSWORD =
            the("CAMPO DE TEXTO PASSWORD").located(xpath("//input[@id='create-account-password']"));

    public static final Target TXT_CONFIRM_PASSWORD =
            the("CAMPO DE TEXTO CONFIRMACION DE PASSWORD").located(xpath("//input[@id='create-account-confirm-password']"));

    public static final Target CHK_TC =
            the("CHECK TERMINOS Y CONDICIONES").located(xpath("//input[@id='create-account-expedia-policy']"));

    public static final Target BTN_SUBMIT =
            the("BOTON SUBMIT").located(xpath("//button[@id='create-account-submit-button']"));

    public static final Target BTN_USER =
            the("BOTON NOMBRE DE USUARIO").located(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']"));
}