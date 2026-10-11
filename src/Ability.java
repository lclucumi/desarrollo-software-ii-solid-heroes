/*
 * ============================================================
 * Archivo: Ability.java
 * ============================================================
 *
 * Ability representa el contrato común para todas las habilidades
 * que puede tener un superhéroe.
 *
 * Una interfaz define QUÉ debe poder hacer un objeto,
 * pero no CÓMO debe hacerlo.
 *
 * Cada clase que implemente esta interfaz decidirá
 * cómo utilizar esa habilidad.
 */

public interface Ability {

    /*
     * Toda habilidad debe poder utilizarse.
     *
     * La implementación concreta se definirá
     * en las clases que implementen esta interfaz.
     */
    void use();
}
