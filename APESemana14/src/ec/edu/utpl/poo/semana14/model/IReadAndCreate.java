package ec.edu.utpl.poo.semana14.model;

/**
 * Esta interfaz nos sirve para que el usuario pueda crear un color.
 * Creada con el propósito de tener varias formas distintas de creación de un color.
 *
 * @author Oliver Pinos
 */
public interface IReadAndCreate {

    /**
     * Este es el método de la interfaz, nos sirve para que el usuario pueda crear un color de una manera distinta
     * en cada caso.
     *
     * @return Retorna un nuevo objeto del tipo Color
     */
    Color readAndCreate();

}
