package ec.edu.utpl.poo.semana14.model;

/**
 * Esta clase nos sirve para poder validar el dato correspondiente a un componente del color.
 * Usado principalmente a la hora de crear un color en alguna de las dos clases que heredan la interfaz IReadAnCreate.
 *
 * @author Oliver Pinos
 */
public class ColorValidator {

    /**
     * Este es el constructor por defecto de la clase.
     */
    public ColorValidator() {
    }

    /**
     * Este es el método que se utiliza para validar el dato correspondiente a un componente del color.
     * El dato a validar es un número entero, el cual tiene que ir desde el número 0 hasta el número 255.
     *
     * @param color Corresponde a un número entero que representa un componente del color.
     * @exception java.lang.IllegalArgumentException Lanza la excepción si el dato no es un número entero que vaya desde
     * el número 0 hasta el número 255.
     */
    public static void validateColorRange(int color) {
        if(!(color >= 0 && color <= 255)) {
            throw new IllegalArgumentException("Value out of range");
        }
    }

}
