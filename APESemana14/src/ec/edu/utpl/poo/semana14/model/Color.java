package ec.edu.utpl.poo.semana14.model;

/**
 * Esta clase nos sirve para crear un color utilizando la composición de color RGB.
 * El modelo RGB está formado por los tres componentes de colores primarios,
 * los componentes de color son las señales rojo, verde y azul.
 * Usado principalmente en las clases que le ayudan al usuario a crear un color.
 *
 * @author Oliver Pinos
 */
public class Color {

    private int R;
    private int G;
    private int B;

    /**
     * Este constructor es el encargado de crear el color utilizando la composición RGB, se necesitan
     * tres parámetros, cada uno representa un componente del color.
     * Cada parámetro es un número entero el cual va desde el número 0 hasta el número 255.
     *
     * @param r Número entero que corresponde al componente Red, el cual representa el color rojo.
     * @param g Número entero que corresponde al componente Green, el cual representa el color verde.
     * @param b Número entero que corresponde al componente Blue, el cual representa el color azul.
     */
    public Color(int r, int g, int b) {
        R = r;
        G = g;
        B = b;
    }

    /**
     * Este método es el getter del componente rojo (Red), nos sirve para poder acceder al valor de dicho componente.
     * Usado principalmente para poder combinar dos colores en la clase CombineColors.
     *
     * @return Nos proporciona el valor del componente rojo (Red), el cual es un número que va desde el número 0
     * hasta el número 255.
     */
    public int getR() {
        return R;
    }

    /**
     * Este método es el getter del componente verde (Green), nos sirve para poder acceder al valor de dicho componente.
     * Usado principalmente para poder combinar dos colores en la clase CombineColors.
     *
     * @return Nos proporciona el valor del componente verde (Green), el cual es un número que va desde el número 0
     * hasta el número 255.
     */
    public int getG() {
        return G;
    }

    /**
     * Este método es el getter del componente rojo (Red), nos sirve para poder acceder al valor de dicho componente.
     * Usado principalmente para poder combinar dos colores en la clase CombineColors.
     *
     * @return Nos proporciona el valor del componente azul (Blue), el cual es un número que va desde el número 0
     * hasta el número 255.
     */
    public int getB() {
        return B;
    }

    /**
     * Este método es el toString generado por Java, nos sirve para poder visualizar los tres componentes del objeto Color
     *
     * @return Retorna una cadena y la muestra en pantalla.
     */
    @Override
    public String toString() {
        return String.format("{ R: %d, G: %d, B: %d }", R, G, B);
    }
}