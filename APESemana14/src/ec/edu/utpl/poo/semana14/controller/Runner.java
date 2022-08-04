package ec.edu.utpl.poo.semana14.controller;

import ec.edu.utpl.poo.semana14.model.Color;
import ec.edu.utpl.poo.semana14.model.CombineColors;
import ec.edu.utpl.poo.semana14.model.Create;
import ec.edu.utpl.poo.semana14.model.CreateGUI;

import javax.swing.*;
import java.util.Scanner;

/**
 * Esta es la clase que nos funciona como clase Main.
 *
 * @author Oliver Pinos
 */
public class Runner {

    /**
     * Este es el método principal del programa, en primer lugar se le pregunta al usuario si quiere crear los colores
     * mediante consola o por interfaz gráfica, dependiendo de su elección, se pasará a crear los colores usando una de
     * las dos clases que heredan IReadAndCreate, y finaliza combinando dichos colores usando la clase CombineColors.
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String option;
        System.out.println("Seleccione:");
        System.out.println("1. Consola");
        System.out.println("2. GUI");
        System.out.print("Su selección: ");
        option = lector.next();

        if( option.equalsIgnoreCase("1")) {

            Create create = new Create();

            Color c1 = create.readAndCreate();
            Color c2 = create.readAndCreate();

            CombineColors combineColors = new CombineColors();

            Color combinado = combineColors.combine(c1, c2);

            System.out.println(combinado);

        } else if(option.equalsIgnoreCase("2")) {

            CreateGUI createGUI = new CreateGUI();

            Color c1 = createGUI.readAndCreate();
            Color c2 = createGUI.readAndCreate();

            CombineColors combineColors = new CombineColors();

            Color combinado = combineColors.combine(c1, c2);

            JOptionPane.showMessageDialog(null, combinado.toString());

        }
    }

}
