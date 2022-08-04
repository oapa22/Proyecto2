package ec.edu.utpl.poo.semana14.model;

/**
 * Esta clase nos sirve para poder combinar dos colores.
 * Usada principalmente en la clase Runner, la cual actúa como clase Main.
 * Implementa la interfaz ICombineColors
 *
 * @author Oliver Pinos
 */
public class CombineColors implements ICombineColors {

    /**
     * Este es el constructor por defecto de la clase.
     */
    public CombineColors() {
    }

    /**
     * Este método es heredado de la interfaz ICombineColors, nos sirve para poder combinar dos colores.
     * La fórmula de combinación de colores para este caso es el promedio de los componentes del mismo tipo de los dos
     * colores proporcionados en los parámetros.
     *
     * @param firstColor Corresponde a un Objeto de tipo Color el cual se usará para combinar con otro color.
     * @param secondColor Corresponde a un Objeto de tipo Color el cual se usará para combinar con otro color.
     * @return Retornará un color nuevo resultado de la combinación de los dos colores proporcionados en los parámetros.
     */
    @Override
    public Color combine(Color firstColor, Color secondColor) {
        return new Color((firstColor.getR() + secondColor.getR()) / 2,
                (firstColor.getG() + secondColor.getG()) / 2 ,
                (firstColor.getB() + secondColor.getB()) / 2);
    }
}
