package ec.edu.utpl.poo.semana14.model;

import java.util.Scanner;

/**
 * Esta clase nos sirve para que el usuario pueda crear un color mediante consola.
 * Usada principalmente en la clase Runner, la cual actúa como clase Main.
 * Implementa la interfaz IReadAndCreate
 *
 * @author Oliver Pinos
 */
public class Create implements IReadAndCreate{

    /**
     * Este es el constructor por defecto de la clase.
     */
    public Create() {
    }

    /**
     * Este método es heredado de la interfaz IReadAndCreate, nos sirve para que el usuario pueda crear un color.
     * En este caso, el usuario crea un color mediante mensajes que le aparecen en consola, dichos mensajes le piden
     * al usuario ingresar los datos de cada componente del color.
     * Los datos ingresados por el usuario son validados mediante el método validateColorRange, encontrado en la clase
     * ColorValidator.
     *
     * @return Retorna un nuevo objeto del tipo Color.
     */
    @Override
    public Color readAndCreate() {

        Scanner lector = new Scanner(System.in);
        int r, g, b;

        System.out.println("Ingrese los datos del color");

        System.out.print("Ingrese el valor de R: ");
        r = lector.nextInt();
        ColorValidator.validateColorRange(r);

        System.out.print("Ingrese el valor de G: ");
        g = lector.nextInt();
        ColorValidator.validateColorRange(g);

        System.out.print("Ingrese el valor de B: ");
        b = lector.nextInt();
        ColorValidator.validateColorRange(b);

        return new Color(r, g, b);
    }
}
