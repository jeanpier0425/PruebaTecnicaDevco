package tasks;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class Realizar {

    public static void validacion(String step, String nameScenario) {
        int YES = 1;
        String reason = "";
        String[] options = {"No", "Si"};
        int optionSelected = JOptionPane.showOptionDialog(new JFrame(),  "El paso \"" + step + "\" fue ejecutado correctamente?",
                nameScenario, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        if (optionSelected == 0) {
            reason = JOptionPane.showInputDialog("Entre la razon del porque la prueba no ejecuto correctamente");
        }
        assertEquals(reason, YES, optionSelected);
    }
}
