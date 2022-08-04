package ec.edu.utpl.poo.semana14.model;

/**
 * Esta interfaz nos sirve para poder combinar dos colores.
 * Creada con el propósito de tener varias formas de combinación de colores.
 *
 * @author Oliver Pinos
 */
public interface ICombineColors {

    /**
     * Es el método de la interfaz, nos sirve para combinar dos colores, dicha combinación ocupa una fórmula distinta
     * en cada caso.
     *
     * @param firstColor Corresponde a un Objeto de tipo Color el cual se usará para combinar con otro color.
     * @param secondColor Corresponde a un Objeto de tipo Color el cual se usará para combinar con otro color.
     * @return Retornará un color nuevo resultado de la combinación de los dos colores proporcionados en los parámetros.
     */
    Color combine(Color firstColor, Color secondColor);

}
