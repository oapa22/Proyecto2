package ec.edu.utpl.poo.semana14.model;

import javax.swing.*;

/**
 * Esta clase nos sirve para que el usuario pueda crear un color mediante una interfaz gráfica.
 * Usada principalmente en la clase Runner, la cual actúa como clase Main.
 * Implementa la interfaz IReadAndCreate
 *
 * @author Oliver Pinos
 */
public class CreateGUI implements IReadAndCreate{

    /**
     * Este es el constructor por defecto de la clase.
     */
    public CreateGUI() {
    }

    /**
     * Este método es heredado de la interfaz IReadAndCreate, nos sirve para que el usuario pueda crear un color.
     * En este caso, el usuario crea un color con ayuda de una interfaz gráfica, la cual le pide al usuario ingresar
     * por teclado los valores para cada componente del color.
     * Los datos ingresados por el usuario son validados mediante el método validateColorRange, encontrado en la clase
     * ColorValidator.
     *
     * @return Retorna un nuevo objeto del tipo Color.
     */
    @Override
    public Color readAndCreate() {

        int r, g, b;
        String rTxt, gTxt, bTxt;

        rTxt = JOptionPane.showInputDialog("Valor para R:");
        gTxt = JOptionPane.showInputDialog("Valor para G:");
        bTxt = JOptionPane.showInputDialog("Valor para B:");

        r = Integer.parseInt(rTxt);
        g = Integer.parseInt(gTxt);
        b = Integer.parseInt(bTxt);

        ColorValidator.validateColorRange(r);
        ColorValidator.validateColorRange(g);
        ColorValidator.validateColorRange(b);

        return new Color(r, g, b);

    }
}
